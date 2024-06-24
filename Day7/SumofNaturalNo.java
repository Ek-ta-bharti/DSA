package Day7;
import java.util.*;
import java.io.*;

public class SumofNaturalNo {

    public static int NaturalNo(int n){
     if(n==0){
        return 0;
     }
     return n + NaturalNo( n-1);
     
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no.>> ");
        int n = sc.nextInt();
        int sum = NaturalNo(n);  
        System.out.print("Sum of first " + n + " natural numbers is: " + sum);
    }
    
}
