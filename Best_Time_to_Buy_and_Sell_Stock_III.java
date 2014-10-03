public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int[] preMin = new int[prices.length];
        int[] preProfit = new int[prices.length];
        int[] postMax = new int[prices.length];
        int[] postProfit = new int[prices.length];
        preMin[0] = prices[0];
        preProfit[0] = 0;
        for (int i = 1; i<prices.length; i++) {
            preMin[i] = Math.min(prices[i], preMin[i-1]);
            preProfit[i] = Math.max(preProfit[i-1], prices[i] - preMin[i]);
        }
        postMax[prices.length - 1] = prices[prices.length - 1];
        postProfit[prices.length - 1] = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            postMax[i] = Math.max(prices[i], postMax[i+1]);
            postProfit[i] = Math.max(postProfit[i+1], postMax[i] - prices[i]);
        }
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++) {
            maxProfit = Math.max(maxProfit, preProfit[i]+postProfit[i]);
        }
        return maxProfit;
    }
}