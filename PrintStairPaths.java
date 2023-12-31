public class PrintStairPaths {
    public static void main(String[] args) {
        int n = 5;
        printStairPaths(n, "");
    }

    public static void printStairPaths(int n, String path) {
        // Base Case
        if (n < 0)
            return;
        else if (n == 0) {
            System.out.println(path);
            return;
        }

        // Kaam
        printStairPaths(n - 1, path + "1");
        printStairPaths(n - 2, path + "2");
        printStairPaths(n - 3, path + "3");
    }
}
