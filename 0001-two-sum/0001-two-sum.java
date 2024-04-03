import java.util.Scanner;
class Solution {
    Solution(){

    }
    public int[] twoSum(int[] nums, int target) {
       int[] a = new int[2];
       for(int i = 0; i<nums.length;i++){
           for(int j = i+1; j<nums.length;j++){
                if((nums[i]+nums[j]) == target){
                  a[0] = i;
                  a[1] = j;
                   return a;
                }
           }
       } 
       return new int[]{-1, -1};
    }
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
    int[] nums = new int[10000];
    for(int i = 0;i<nums.length;i++){
        nums[i] = sc.nextInt();
    }
    int target = sc.nextInt();

    Solution obj = new Solution();
    System.out.println(obj.twoSum(nums,target));
}
   
}