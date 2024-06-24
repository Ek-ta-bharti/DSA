package Day7;

import java.util.*;
import java.io.*;

public class PrintAscending {

    public static void AscendingOrder(int n) {
        if (n == 21) {
            return;
        }
        System.out.print(n);
        AscendingOrder(n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number under 20>> "); // according to your need i'm just create sample
        int n = sc.nextInt();
        AscendingOrder(n);
    }

}
