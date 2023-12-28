public class DisplayArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        disArray(arr, 3);
    }

    public static void disArray(int[] arr, int idx) {
        if (idx == arr.length)
            return;
        System.out.println(arr[idx]);
        disArray(arr, idx + 1);
    }
}
