package Day7;

import java.util.*;
import java.io.*;

public class Fibonacci {
    public static int Fs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fs(n - 1) + Fs(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for Fibonacci>> ");
        int n = sc.nextInt();
        sc.close();

        int sum = Fs(n);
        System.out.print(sum);
    }

}
