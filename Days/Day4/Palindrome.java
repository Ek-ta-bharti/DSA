public class Palindrome {
    public static boolean example(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int nums = 0;
        while (n > 0) {
            int d = n % 10;
            nums = nums * 10 + d;
            n = n / 10;
        }
        // if (nums == x) {
        // return true;
        // } else {
        // return false;
        // }
        return nums == x;
    }

    public static void main(String[] args) {
        int x = -121;
        boolean isPalindrome = example(x);
        System.out.println("Is " + x + " a palindrome? " + isPalindrome);
    }

}
