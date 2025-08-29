import java.util.*;
public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int i;
        boolean flag = false;
        String newStr = "";
        for(i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) {
                 newStr = newStr + ch;
                 flag = true;
            }
        }
        if(flag == true) 
            System.out.println(newStr);
        else 
            System.out.println("0");
    }
}
