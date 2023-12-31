public class PrintKeypadCombinations {
    public static void main(String[] args) {
        String ques = "678";
        printKeypad(ques, "");
    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKeypad(String ques, String ans) {
        // Base Case
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Kaam
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String codeforch = codes[ch - '0'];

        for (int i = 0; i < codeforch.length(); i++) {
            char cho = codeforch.charAt(i);
            printKeypad(roq, ans + cho);
        }
    }
}
