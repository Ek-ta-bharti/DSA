//inside value

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length - 1;
        int carry = 0;

        while (p >= 0 || k > 0 || carry > 0) {
            int numval = (p >= 0) ? num[p] : 0;
            int d = k % 10;
            int sum = numval + d + carry;
            ans.add(sum % 10);
            carry = sum / 10;
            p--;
            k /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] num = {1, 2, 0, 0};
        int k = 34;
        List<Integer> result = solution.addToArrayForm(num, k);
        System.out.println("Input: num = " + arrayToString(num) + ", k = " + k);
        System.out.println("Output: " + result);
    }

    // Helper method to convert an array to string for printing
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
