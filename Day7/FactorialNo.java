package Day7;

import java.util.*;
import java.io.*;

public class FactorialNo {

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n * Factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number For Factorial >> ");
        int n = sc.nextInt();

        int sum = Factorial(n);
        System.out.print("Factorial " + n +  " Result>> "+ sum);
    }
}
