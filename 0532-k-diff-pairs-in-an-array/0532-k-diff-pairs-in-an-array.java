class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int a:map.keySet()){
            if(k!=0){
                int b = a+k; // 2nd number = 1st number + differenceK
                if(map.containsKey(b)) count++;
            }else{ // means k == 0
                /* When k = 0, for each element num1 if we add k=0, then num2 = num1+0 = num1. Thus, when as we have single copy of all the numbers in the key set, when we search whether num1 exists in the set, obviously we get true. But we are searching whether another num1 exists other than current num1 by seeing the count of num1 which is stored as value of each num1 in the HashMap. i.e <num1, numberOfOccurencesOfnum1InTheArray> So, only if  numberOfOccurencesOfnum1InTheArray >=2, WE increment the value of count else we don't.                       */
                if(map.get(a)>=2){
                    count++;
                }
            }
        }
        return count;
    }
    
}