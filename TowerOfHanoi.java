public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B', 'C');
    }

    public static void towerOfHanoi(int n, char t1, char t2, char t3) {
        if (n == 0) // Base Case
            return;
        towerOfHanoi(n - 1, t1, t3, t2);
        System.out.println(n + "[" + t1 + " -> " + t2 + "]");
        towerOfHanoi(n - 1, t3, t2, t1);
    }
}
