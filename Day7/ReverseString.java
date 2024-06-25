package Day7;

import java.util.*;
import java.io.*;

public class ReverseString {
    public static String Example(String n) {
        if (n.isEmpty() || n.length() == 1) {
            System.out.println("Plase enter the string foe reversing process");
            return n;
        }
        return Example(n.substring(1)) + n.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String for Reverse>> ");
        String n = sc.nextLine();
        sc.close();
        String ans = Example(n);
        System.out.println(n + " Reverse Number  " + ans);
    }

}
