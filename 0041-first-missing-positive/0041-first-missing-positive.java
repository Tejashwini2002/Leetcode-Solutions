
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=0,k=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]>0){
                j=i;
                break;
            }
        }
        if(nums[j]!=1){
            return 1;
        }

        for(i=j;i<nums.length-1;i++){
        if(nums[i]!= nums[i+1] && nums[i] != nums[i+1]-1){
            return nums[i]+1;
        }
      
        }
        return nums[nums.length-1]+1;
    }
}