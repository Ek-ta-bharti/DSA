public class Quick {

    public void Quick(int arr[], int h, int l) {
        if (l < h) {
            int m = Position(arr, l, h);

            Quick(arr, l, m - 1);
            Quick(arr, m + 1, h);
        }
    }

    public static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ");
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 9, 3, 6, 21, 29 };
        int n = arr.length;
        System.out.println("Before sorting : ");
        printArr(arr, n);

        Quick(arr, 0, n - 1);
        System.out.println("After sorting : ");
    }
}