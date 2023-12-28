import java.util.ArrayList;

public class GetKeypadCombinations {
    public static void main(String[] args) {
        String str = "23";
        ArrayList<String> combinations = getKeypadCombinations(str);
        System.out.println(combinations);
    }

    // Define keypad mappings
    public static String[] codes = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static ArrayList<String> getKeypadCombinations(String str) {
        // Base Case: If the input string is empty, return a list with an empty string
        if (str.length() == 0) {
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }

        // Recursive Case
        char currentDigit = str.charAt(0);
        String remainingString = str.substring(1);
        ArrayList<String> recursiveResults = getKeypadCombinations(remainingString);
        ArrayList<String> myResults = new ArrayList<>();

        // Merge characters from current digit's code with recursive results
        for (int i = 0; i < codes[currentDigit - '0'].length(); i++) {
            char currentCodeChar = codes[currentDigit - '0'].charAt(i);
            for (String recursiveResult : recursiveResults) {
                myResults.add(currentCodeChar + recursiveResult);
            }
        }
        return myResults;
    }
}
