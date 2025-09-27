class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit; 
    }
}