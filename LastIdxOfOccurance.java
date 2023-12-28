public class LastIdxOfOccurance {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 5, 4, 12, 2, 1, 6, 4 };
        System.out.println(lastIdx(arr, 0, 4));
    }

    public static int lastIdx(int[] arr, int idx, int data) {
        if (idx == arr.length) // Base Case
            return -1;
        int liisa = lastIdx(arr, idx + 1, data);
        return liisa == -1 ? arr[idx] == data ? idx : -1 : liisa;
    }
}
