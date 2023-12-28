import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetMazePaths {
    public static void main(String[] args) {
        // Get user input for dr and dc
        int dr = 3;
        int dc = 3;
        ArrayList<String> paths = getMazePaths(1, 1, dr, dc);
        System.out.println(paths);
        System.out.println(paths.size()); // Output: 20
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        // Base Case
        if (sr == dr && sc == dc) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // Kaam
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if (sc < dc) {
            hpaths = getMazePaths(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }
        return paths;
    }
}
