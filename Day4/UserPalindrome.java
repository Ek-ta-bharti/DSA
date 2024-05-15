import java.util.*;

public class UserPalindrome {
    public static boolean example(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int nums = 0;
        while (n > 0) {
            int digit = n % 10;
            nums = nums * 10 + digit;
            n = n / 10;
        }
        return nums == x;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();
        boolean isPalindrome = example(x);
        System.out.println("Is " + x + " a palindrome? " + isPalindrome);
        scanner.close();
    }
}