class Solution {
    public int maxProfit(int[] prices) {
        int cost = prices[0];
        int n = prices.length;
        int maxprofit =0;

        for(int i =0;i<n;i++){
            cost = Math.min(cost,prices[i]);
            maxprofit = Math.max(maxprofit,prices[i]-cost);
        }
        return maxprofit;
    }
}
