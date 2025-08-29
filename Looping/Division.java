import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int count = 0;
        //Division without '/' operator
        while(a >= b) {
            a-=b;
            count++;
        }
        System.out.println(count);
    }
}
