
public class MissingNumber {
    public static int Numbers(int[] nums) {
        int range = nums.length;

        int accSum = (range * (range + 1) / 2);

        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
        }
        int ans = accSum - currSum;
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 2, 3 };
        System.out.println("Missing No. is : " + Numbers(nums));
    }
}