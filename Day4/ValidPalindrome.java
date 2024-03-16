public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        // Test cases
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.isPalindrome(s1));

        String s2 = "race a car";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + solution.isPalindrome(s2));

        String s3 = " ";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + solution.isPalindrome(s3));
    }
}
