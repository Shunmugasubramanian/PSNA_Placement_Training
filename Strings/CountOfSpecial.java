import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int i, sCount = 0;
        for(i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isLetterOrDigit(ch)) 
                sCount++;
        }
        System.out.println(sCount);
    }
}
