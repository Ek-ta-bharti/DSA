package Day6;

import java.util.*;
import java.io.*;

public class LowerBound {
    public static int findirstOccurence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of element: ");
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter your Target Element: ");
        int target = sc.nextInt();

        int result = findirstOccurence(arr, target);
        if (target == -1) {
            System.out.println("Target element is nnot in array");
        } else {
            System.out.println("first value in array " + result);
        }
    }
}
