class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        int[] a = new int[set.size()];
        int i=0;
        for(int item: set ){
            a[i] = item;
            i++;
        }
        return a;
    }
}