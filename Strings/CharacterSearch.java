import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        s.nextLine();
        String str = s.nextLine();
        if(str.contains(String.valueOf(c))) 
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}
