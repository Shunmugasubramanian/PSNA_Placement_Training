import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long num,p = 1;
        long copy = n;        
        while(n > 0) {
            n /= 10;
            p *= 10;
        }
        p /= 10;
        n = copy;        
        while(p > 0) {
            num = n / p;
            n %= p;
            p /= 10;
            if(num % 2 == 0)
                System.out.println(num+"-Even");
            else
                System.out.println(num+"-Odd");
        }  
    }
}
