//using scanner
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of prices: ");
        int n = scanner.nextInt();
        
        int[] prices = new int[n];
        System.out.println("Enter the prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        System.out.println("Maximum profit: " + solution.maxProfit(prices));
        scanner.close();
    }
}
