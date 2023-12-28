class PrintZigZag {
    public static void main(String[] args) {
        int n = 2;
        pzz(n);
    }

    public static void pzz(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
    }
}