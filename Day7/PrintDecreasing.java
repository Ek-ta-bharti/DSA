package Day7;

import java.io.*;
import java.util.*;

public class PrintDecreasing {
    public static void DecreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        DecreasingOrder(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no>>>>  ");
        int n = sc.nextInt();
        DecreasingOrder(n);
    }

}
