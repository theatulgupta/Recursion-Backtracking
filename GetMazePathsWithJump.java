import java.util.*;

public class GetMazePathsWithJump {
    public static void main(String[] args) {
        int n = 4, m = 6;
        ArrayList<String> paths = getMazePathsWithJump(1, 1, n, m);
        for (String path : paths) {
            System.out.println(path);
        }
    }

    public static ArrayList<String> getMazePathsWithJump(int sr, int sc, int dr, int dc) {
        // Base Case
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // Kaam
        ArrayList<String> paths = new ArrayList<>();

        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePathsWithJump(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }
        }

        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getMazePathsWithJump(sr + ms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }
        }

        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> dpaths = getMazePathsWithJump(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }

}