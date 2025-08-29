import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int i = 2;        
        while(true) {
            if(i % a == 0 && i % b == 0)
                break;
            i++;
        }
        System.out.println(i);
    }
}
