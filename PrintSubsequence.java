public class PrintSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        printSubsequence(str, "");
    }

    public static void printSubsequence(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Kaam
        char ch = str.charAt(0);
        String ros = str.substring(1);

        printSubsequence(ros, ans + ch);
        printSubsequence(ros, ans + "");
    }
}
