class Solution {
    public int majorityElement(int[] nums) {
        // Moore's Voting Algorithm
        int n = nums.length; // size of the given array
        int count = 0; // variable count
        int maj_ele = 0; // to store the majority element
        // applying the algorithm
        for(int i = 0;i<n;i++){
            if(count == 0){ // If count is 0 till now, then we make the current ele as maj_ele
                count = 1;
                maj_ele = nums[i];
            }else if(maj_ele == nums[i]){ // If current ele and maj_ele both are same, then I increment the count
                count++;
            }else{
                count--;
            }
        }
        // checking if the stored element is the majority element
        int count1 = 0; // to store the count of the maj_ele in the entire given array
        for(int i = 0;i<n;i++){
            if(nums[i] == maj_ele){
                count1++;
            }
        }
        if(count1>(n/2)){
            return maj_ele;
        }
        return -1;

    }
}