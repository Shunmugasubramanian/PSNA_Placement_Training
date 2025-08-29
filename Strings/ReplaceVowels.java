import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String newStr = str.replaceAll("[aeiouAEIOU]"," ");
        System.out.println(newStr);
    }
}
