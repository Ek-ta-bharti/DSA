package Days;

import java.util.Arrays;

public class SquareOfShortedArray {
    public static int[] SquareExample(int[] nums) {
        // Sorting the array
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        int[] ans = new int[nums.length];

        int prt = nums.length - 1;

        while (start <= end) {
            int ss = nums[start] * nums[start];
            int ee = nums[end] * nums[end];

            if (ee <= ss) {
                ans[prt] = ss;
                start++;
            } else {
                ans[prt] = ee;
                end--;
            }
            prt--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -8, 0, 4, 7, 8, 9 };
        int[] ans = SquareExample(nums); // Pass the array to the method
        System.out.println(Arrays.toString(ans)); // Print the result
    }
}
