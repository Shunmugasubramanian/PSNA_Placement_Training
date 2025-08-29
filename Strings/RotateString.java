import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.nextLine();
        String str = s.nextLine();
        int len = str.length();
        char[] ch = str.toCharArray();
        int n = num % len;
        String newStr = str.substring(n) + str.substring(0,n);
        System.out.println(newStr);
    }
}
