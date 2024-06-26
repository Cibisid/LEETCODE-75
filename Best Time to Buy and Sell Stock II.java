class Solution {
    public int maxProfit(int[] prices) {
        // Buy the stock on the first day
        int buyPrice = prices[0];
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                // Sell the stock right before the drop
                ans += prices[i - 1] - buyPrice;
                // Buy the stock at the drop day
                buyPrice = prices[i];
            }
        }
        // Sell the stock at hand
        return ans + prices[prices.length - 1] - buyPrice;
    }
}