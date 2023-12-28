public class DisplayReverseArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        disRevArray(arr, 0);
    }

    public static void disRevArray(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        disRevArray(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}
