package Day7;

import java.util.*;
import java.io.*;

public class Fibonacci {
    public static int Fs(int n) {
        // if (n == 0) {
        // return 0;
        // }
        // if (n == 1) {
        // return 1;
        // }/

        if (n <= 1) {
            return n;
        }
        return Fs(n - 1) + Fs(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for Fibonacci>> ");
        int n = sc.nextInt();
        sc.close();
        System.out.print("Fibonacci series up to " + n + " terms:  ");
        int sum = Fs(n);
        for (int i = 0; i < n; i++) {
            System.out.print(Fs(i) + " ");
        }
        System.out.println("\nTotal sum " + sum);

    }
}
