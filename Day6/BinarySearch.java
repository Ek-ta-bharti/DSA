package Day6;

import java.io.*;
import java.util.*;

public class BinarySearch {
    public static int binaryM(int [] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of Element");
        int n = in.nextInt();

        System.out.println("Enter the value: ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target element");
        int t = in.nextInt();

        int result = binaryM(arr, t);
        if (result == 0) {
            System.out.println("targrt element is not in array");
        } else {
            System.out.println("match with taget array " + t);
        }
    }
}
