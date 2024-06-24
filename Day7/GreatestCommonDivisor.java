package Day7;

import java.util.*;
import java.io.*;

public class GreatestCommonDivisor {
    public static int Divisor(int n, int m) {
        if (m == 0) {
            return n;
        }
        return Divisor(m, n % m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value (x) >> ");
        int n = sc.nextInt();
        System.out.print("Enter the value (y) >> ");
        int m = sc.nextInt();
        sc.close();

        int resul = Divisor(n, m);
        System.out.print("Final Divisor Value " + resul);
    }
}
