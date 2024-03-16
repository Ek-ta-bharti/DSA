import java.util.*;

public class UserValidPalindrome {
    public boolean example(String s) {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence:");
        String input = sc.nextLine(); 
        UserValidPalindrome obj = new UserValidPalindrome(); 
        boolean isPalindrome = obj.example(input); 

        if (isPalindrome)
            System.out.println("The entered sentence is a palindrome.");
        else
            System.out.println("The entered sentence is not a palindrome.");
    }
}
