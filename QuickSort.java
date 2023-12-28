public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int lo, int hi) {
        // Base Case
        if (lo >= hi) {
            return;
        }

        // Kaam
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        quickSort(arr, lo, pi - 1);
        quickSort(arr, pi + 1, hi);
    }

    public static int partition(int[] arr, int pivot, int lo, int hi) {
        int i = lo;
        int j = lo;  // Corrected initialization of j
        while (i < hi) {
            if (arr[i] < pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        swap(arr, j, hi); // Corrected the swap position
        return j; // pivot index after swapping with jth index. jth index is the correct position
                  // of pivot.
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
