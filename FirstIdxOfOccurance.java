public class FirstIdxOfOccurance {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 5, 4, 12, 2, 1, 6, 4 };
        System.out.println(firstIdx(arr, 0, 12));
    }

    public static int firstIdx(int[] arr, int idx, int data) {
        if (idx == arr.length) // Base Case
            return -1;
        return arr[idx] == data ? idx : firstIdx(arr, idx + 1, data);
    }
}
