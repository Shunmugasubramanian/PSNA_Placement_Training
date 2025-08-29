import java.util.*;
public class Solution {
    public static void main(String[] args) {       
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int digit = s.nextInt();
        int count = 0;
        long num;        
        while(n > 0) {
            num = n % 10;
            n /= 10;
            if(num == digit) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
