import java.util.ArrayList;

public class GetSubsequence {
    public static void main(String[] args) {
        String abc = "abc";
        System.out.println(getSubsequence(abc));
    }

    public static ArrayList<String> getSubsequence(String str) {
        if (str.isEmpty()) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }

        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);

        ArrayList<String> resultWithoutFirstChar = getSubsequence(restOfString);

        ArrayList<String> resultWithFirstChar = new ArrayList<>();
        for (String val : resultWithoutFirstChar) {
            resultWithFirstChar.add(val); // Without the first char
            resultWithFirstChar.add(firstChar + val); // With the first char
        }

        return resultWithFirstChar;
    }
}
