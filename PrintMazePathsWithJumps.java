class PrintMazePathsWithJumps {
    public static void main(String[] args) {
        printMazePaths(1, 1, 3, 3, "");
    }

    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        // Base Case
        if (sr == dr && sc == dc) {
            System.out.println(psf);
            return;
        }

        // Kaam
        for (int ms = 1; ms <= dc - sc; ms++) { // Horizontal
            printMazePaths(sr, sc + 1, dr, dc, psf + "h" + ms);
        }
        for (int ms = 1; ms <= dr - sr; ms++) { // Vertical
            printMazePaths(sr + 1, sc, dr, dc, psf + "v" + ms);
        }
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) { // Diagonal
            printMazePaths(sr + 1, sc + 1, dr, dc, psf + "d" + ms);
        }
    }
}