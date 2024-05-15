public class RemoveElement {
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
        int[] nums = { 3, 4, 6, 3, 2, 6, 6 };
        int val = 3;
       
        int newSize = duplicateElement(nums, val);
        for (int i = 0; i < newSize; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
