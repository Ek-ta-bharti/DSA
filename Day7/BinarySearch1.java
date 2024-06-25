package Day7;

import java.util.*;
import java.io.*;

public class BinarySearch1 {

    public static int Bs(int arr[], int searchelement, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == searchelement) {
                return mid;
            }
            if (arr[mid] > searchelement) {
                return Bs(arr, searchelement, low, mid - 1);
            }
            return Bs(arr, searchelement, mid + 1, high);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int searchelement = scanner.nextInt();

        int result = Bs(arr, searchelement, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();

    }

}
