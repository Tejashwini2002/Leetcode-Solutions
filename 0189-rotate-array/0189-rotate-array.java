class Solution {
    public void rotate(int[] nums, int k) {
        int[] b = new int[nums.length];
        if(k>=nums.length){
            k = k%nums.length; // at arrays lenth's rotation, the array elements return to their original position.
        }
        for(int i = 0;i<nums.length;i++){
            b[(i+k)%nums.length] = nums[i];    
        }
        System.arraycopy(b,0,nums,0,nums.length);
    }
}