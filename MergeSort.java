/**
 * MergeSort
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        int[] ans = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {
        // Base Case
        if (lo == hi) {
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }

        // Kaam
        int mid = lo + (hi - lo) / 2;
        int[] fsa = mergeSort(arr, lo, mid);
        int[] lsa = mergeSort(arr, mid + 1, hi);
        int[] merge = mergeSortedArrays(fsa, lsa);
        return merge;
    }

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }
        while (i < a.length)
            c[k++] = a[i++];
        while (j < b.length)
            c[k++] = b[j++];

        return c;
    }
}