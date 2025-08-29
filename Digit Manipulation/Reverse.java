import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long num, rev = 0;        
        while(n > 0) {
            num = n % 10;
            rev = rev * 10 + num;
            n /= 10;
        }
        System.out.print(rev);    
    }
}
