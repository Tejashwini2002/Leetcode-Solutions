class Solution {
    public double averageWaitingTime(int[][] customers) {
        double avg_waiting_time = 0;
        double arrivaltime = customers[0][0];
        double preparingtime = customers[0][1];
        double waitingtime = (preparingtime+arrivaltime)-arrivaltime;
        double endingtime = (preparingtime+arrivaltime);
        
        for(int i = 1;i<customers.length;i++){
          arrivaltime = customers[i][0];
          preparingtime = customers[i][1];
            if(arrivaltime<endingtime){
                endingtime+=preparingtime;
                waitingtime+=(endingtime-arrivaltime);
            }else{
                endingtime= arrivaltime+preparingtime;
                waitingtime = waitingtime+(endingtime-arrivaltime);
            }
        }
       return waitingtime/customers.length;
    }
}