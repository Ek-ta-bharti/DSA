package Day7;

import java.util.*;
import java.io.*;

public class PalindromeCheck {

    public static boolean Pc(String n, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (n.charAt(left) != n.charAt(right)) {
            return false;
        }
        return Pc(n, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Char for check Palindrome  ");
        String n = sc.nextLine();
        boolean ans = Pc(n, 0, n.length() - 1);
        if (ans) {
            System.out.print("YES, " + n + " It's palindrom>> " + ans);
        } else {
            System.out.print("NO, " + n + " It's Not Palindrom>> " + ans);
        }
        sc.close();
    }
}
