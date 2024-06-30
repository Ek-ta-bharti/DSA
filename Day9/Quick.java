public class Quick {

    public static int Position(int[] arr, int l, int h) {
        int i = l;
        int pivot = arr[l];

        for (int j = l + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int tem = arr[l];
        arr[l] = arr[i];
        arr[i] = tem;

        return i;
    }

    public static void Quick(int[] arr, int l, int h) {
        if (l < h) {
            int m = Position(arr, l, h);

            Quick(arr, l, m - 1);
            Quick(arr, m + 1, h);
        }
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // To print the elements in a single line
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 9, 3, 6, 21, 29 };
        int n = arr.length;
        System.out.println("Before sorting: ");
        printArr(arr, n);

        Quick(arr, 0, n - 1);
        System.out.println("After sorting: ");
        printArr(arr, n);
    }
}
