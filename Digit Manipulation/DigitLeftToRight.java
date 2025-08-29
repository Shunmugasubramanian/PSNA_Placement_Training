import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        long n = s.nextInt();
        long num;        
        while(n > 0) {
            num = n % 10;
            System.out.print(num+" ");
            n /= 10;
        }
    }
}
