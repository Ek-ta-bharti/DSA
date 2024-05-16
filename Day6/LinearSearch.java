package Day6;

import java.io.*;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of Element");
        int n = in.nextInt();

        System.out.println("Enter the value: ");
        int [] arr = new int[n];

        for(int i=0; i<n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element");
        int t = in.nextInt();


        int idx =-1;
        for(int i=0; i<n ;i++){
            if(arr[i] == t){
               idx=i;
               break;
            }
        }
        if(idx ==-1){
            System.out.println("targrt element is not in array");
        }else{
            System.out.println("match with taget array " +t);
        }
     }
}
