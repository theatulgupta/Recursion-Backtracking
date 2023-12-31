public class PrintStairsPath {
    public static void main(String[] args) {
        printStairsPath(1, 1, 3, 3, "");
    }

    public static void printStairsPath(int sr, int sc, int dr, int dc, String path) {
        // Base Case
        if (sr > dr || sc > dc) {
            return;
        }

        if (sr == dr && sc == dc) {
            System.out.println(path);
            return;
        }
        // Kaam

        printStairsPath(sr, sc + 1, dr, dc, path + "h"); // Horizontal
        printStairsPath(sr + 1, sc, dr, dc, path + "v"); // Vertical

    }
}