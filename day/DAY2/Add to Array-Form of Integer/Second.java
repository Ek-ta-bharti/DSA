//using scanner
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        int[] num = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            num[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        Solution solution = new Solution();
        List<Integer> result = solution.addToArrayForm(num, k);
        System.out.println("Output: " + result);
        
        scanner.close();
    }
}
