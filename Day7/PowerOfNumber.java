package Day7;

import java.util.*;
import java.io.*;

public class PowerOfNumber {

    public static int AscendingOrder(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * AscendingOrder(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number >> ");
        int x = sc.nextInt();
        System.out.print("Power Value >> ");
        int n = sc.nextInt();
        sc.close();
        int resl = AscendingOrder(x, n);
        System.out.println(resl);
    }
}
