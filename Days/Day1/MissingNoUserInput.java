import java.util.*;

public class MissingNoUserInput {
    public static int findMissingNumber(int[] nums) {
        int range = nums.length ;
        int accSum = (range * (range + 1)) / 2;

        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
        }

        return accSum - currSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int result = findMissingNumber(nums);
        System.out.println("The missing number is: " + result);

        scanner.close();
    }
}
