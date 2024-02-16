//INSIDE THE CODE

public class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] maxValue = new int[n];

        // Calculate the maximum value from the current index to the end
        maxValue[n - 1] = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxValue[i] = Math.max(maxValue[i + 1], prices[i]);
        }

        int maxProfit = 0;
        // Calculate the maximum profit
        for (int i = 0; i < prices.length; i++) {
            int currentProfit = maxValue[i] - prices[i];
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(solution.maxProfit(prices)); // Output: 0
    }
}
