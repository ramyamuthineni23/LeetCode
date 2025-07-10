class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i = 1; i< prices.length; i++) {
            if (prices[i-1] < prices[i]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}

// My Solution
// public int maxProfit(int[] prices) {
//     int profitSoFar = 0;
//     int profit = 0;
//     int minPrice = Integer.MAX_VALUE;
//     int maxPrice = 0;
//     boolean troughFound = false;
//     boolean highFound = false;
//     for(int i=0; i< prices.length; i++) {
//         if (prices[i] < minPrice || (i > 1 && prices[i] < prices[i-1])) {
//             minPrice = prices[i];
//             troughFound = true;
//         } else if (prices[i] - minPrice > profitSoFar) {
//             profitSoFar = prices[i] - minPrice;
//             troughFound = false;
//         }

//         if (troughFound) {
//             profit += profitSoFar;
//             profitSoFar = 0;
//         }
//     }
//     return profit + profitSoFar;
// }