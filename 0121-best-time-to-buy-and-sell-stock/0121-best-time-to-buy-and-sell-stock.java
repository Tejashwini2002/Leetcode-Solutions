class Solution {
    public int maxProfit(int[] prices) {
        /*
        If we are selling the stock on ith day, then we must buy it on the day which is having minimum price from the zeroth day to the (i-1)th day.
        */
        int maxProfit = 0;
        int mini = prices[0];// 
        for(int i = 1;i<prices.length;i++){
            int currProfit = prices[i]-mini;
            maxProfit = Math.max(maxProfit,currProfit);
            mini = Math.min(mini,prices[i]);
        }
        return maxProfit;
    }
}