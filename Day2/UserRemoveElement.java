import java.util.*;

public class UserRemoveElement {
    public static int duplicateElement(int[] nums, int val) {
        int trg = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[trg] = nums[i];
                trg++;
            }
        }
        return trg;
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = n.nextInt();
        int[] nums = new int[size];

        System.out.print("Enter the element of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = n.nextInt();
        }
        System.out.print("Enter the value to remove:");
        int val = n.nextInt();
        int newSize = duplicateElement(nums, val);
        System.out.println("After removing: " + val + ":");
        for (int i = 0; i < newSize; i++) {
            System.out.println(nums[i] + " ");
        }
        n.close();
    }
}
