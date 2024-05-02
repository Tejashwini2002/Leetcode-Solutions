class Solution {
    public int fib(int n) {
        int prev2 = 0;
        int prev = 1;
        if(n<=1){
            return n;
        }
        for(int i = 2;i<=n;i++){
            int curr_i = prev2+prev;
            prev2 = prev;
            prev = curr_i;
        }
        return prev;
    }
}