import java.util.*;
public class Solution {
    public static void main(String[] args) {     
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long num;
        long large=n%10;        
        while(n > 0) {
            num = n % 10;
            if(large< num) {
               large = num;
            }
            n /= 10;
        }
        System.out.println(large);
    }
}
