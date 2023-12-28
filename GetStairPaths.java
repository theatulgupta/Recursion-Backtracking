import java.util.ArrayList;

public class GetStairPaths {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        // Base Case
        if (n == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        } else if (n < 0) {
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        // Kaam
        ArrayList<String> paths1 = getStairPaths(n - 1);
        ArrayList<String> paths2 = getStairPaths(n - 2);
        ArrayList<String> paths3 = getStairPaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();

        for (String path : paths1) {
            paths.add(1 + path);
        }

        for (String path : paths2) {
            paths.add(2 + path);
        }

        for (String path : paths3) {
            paths.add(3 + path);
        }

        return paths;
    }
}
