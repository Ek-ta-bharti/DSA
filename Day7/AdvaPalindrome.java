package Day7;

import java.util.*;
import java.io.*;

public class AdvaPalindrome {

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean result = isPalindrome(normalized);

        if (result) {
            System.out.println("The " + input + " string is a palindrome. " + result);
        } else {
            System.out.println("The " + input + " string is not a palindrome. " + result);
        }

        scanner.close();
    }
}