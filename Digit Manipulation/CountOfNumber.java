import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int count = 0;      
        while(n > 0) {
            long num = n % 10;
            count ++;
            n /= 10;
        }
        System.out.println(count);  
    }
}
