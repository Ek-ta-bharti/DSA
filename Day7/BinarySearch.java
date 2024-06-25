package Day7;

import java.util.*;

public class BinarySearch {

    public static int Bs(int arr[], int searchelement, int low, int high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == searchelement) {
            return mid;
        }
        if (arr[mid] > searchelement) {
            return Bs(arr, searchelement, low, mid - 1);
        }
        return Bs(arr, searchelement, high, mid + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 12, 67, 98, 666 };
        int searchelement = 99;

        int resul = Bs(arr, searchelement, 0, arr.length - 1);

        if(searchelement == -1){
            System.out.println("Please enter valid no.>>>");
        }else{
            System.out.println(resul);
        }
    }

}
