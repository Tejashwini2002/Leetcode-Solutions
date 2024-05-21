class Solution {
    public int numberOfSteps(int num) {
        int res=0;
        while(num!=0){
            if((num&1) == 1){  // If given_number & 1 is 1,then the given number is odd. If given_number & 1 is 0, it is even. 
                num = num -1;
                res = res+1;
            }else{
                num = num/2;
                 res = res+1;
            }
        }
        return res;
    }
}