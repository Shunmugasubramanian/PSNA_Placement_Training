import java.util.*;
public class SwapFirstAndLast {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String result = swapFirstLastInSentence(str);
        System.out.println(result);
    }
    public static String swapFirstLastInSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(swapFirstLast(word)).append(" ");
        }
        return sb.toString().trim();
    }
    public static String swapFirstLast(String word) {
        if (word.length() <= 1)
            return word;
        if (word.length() == 2) 
            return word.charAt(1) + "" + word.charAt(0);
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        return last + word.substring(1, word.length() - 1) + first;
    }
}
