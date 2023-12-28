/**
 * AllIndicesInAnArray
 */
public class AllIndicesInAnArray {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 3, 6, 7, 3, 1, 9, 3 };
        int[] allIndices = allIndices(arr, 3, 0, 0);
        for (int val : allIndices) {
            System.out.println(val);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // Base Case
        if (idx == arr.length)
            return new int[fsf];

        // Kaam
        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, x, idx + 1, fsf);
            return iarr;
        }
    }
}