public class PowerLog {
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(pow(x, n));
    }

    // This would have better time complexity
    public static int pow(int x, int n) {
        if (n == 0) // Base Case
            return 1;
        int nby2 = pow(x, n / 2);
        int nby2sqr = nby2 * nby2;
        return n % 2 == 0 ? nby2sqr : nby2sqr * x;
    }
}
