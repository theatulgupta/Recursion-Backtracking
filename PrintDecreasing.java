public class PrintDecreasing {
    public static void main(String[] args) {
        int n = 5;
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {
        // Base Case
        if (n == 0)
            return;
        System.out.println(n);
        printIncreasing(n - 1);
    }

}
