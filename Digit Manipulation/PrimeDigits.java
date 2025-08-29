import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long num, p = 1;
        long copy = n;
        int factor = 0;        
        while(n > 0) {
            n = n / 10;
            p = p * 10;
        }
        p = p / 10;
        n = copy;        
        while(p > 0) {
            num = n / p;
            n = n % p;
            p = p / 10;            
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    factor++;
                }
            }            
            if(factor == 2)
                System.out.print(num+" ");
            factor = 0;
        }
    }
}
