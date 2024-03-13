import java.util.*;

public class UserRemoveElement2 {
    public static int[] removeElement(int[] nums, int val) {
        int count = 0;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val || !found) {
                nums[count++] = nums[i];
                if (!found && nums[i] == val) {
                    found = true;
                }
            }
        }
        return Arrays.copyOf(nums, count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to remove: ");
        int val = scanner.nextInt();
        int[] result = removeElement(nums, val);

        if (result.length == size) {
            System.out.println("No duplicate element in this array.");
        } else {
            System.out.println("After removing " + val + ":");
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
        scanner.close();
    }
}
