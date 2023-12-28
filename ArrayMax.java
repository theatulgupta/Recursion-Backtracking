public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 21212, 10, 46, 37 };
        System.out.println(maxArr(arr, 0));
    }

    public static int maxArr(int[] arr, int idx) {
        if (idx == arr.length)
            return 0;
        return Math.max(arr[idx], maxArr(arr, idx + 1));
    }
}
