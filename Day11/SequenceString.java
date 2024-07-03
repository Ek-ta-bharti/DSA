package Day11;

import java.util.*;

public class SequenceString {
    public static void function(int[] arr, int index, ArrayList<Integer> tempArr) {
        if (index == arr.length) {
            if (tempArr.size() > 0) {
                System.out.println(tempArr);
            }
            return;
        }
        function(arr, index + 1, tempArr); // Recursive call without including current element
        tempArr.add(arr[index]);
        function(arr, index + 1, tempArr); // Recursive call including current element
        tempArr.remove(tempArr.size() - 1); // Backtrack
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2 };
        System.out.println("For the Array " + Arrays.toString(arr));
        function(arr, 0, new ArrayList<>());
    }
}
