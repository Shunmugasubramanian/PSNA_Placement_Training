import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int product = 1, num;        
        while(n > 0) {
            num = n % 10;
            product *= num;
            n /= 10;
        }
        System.out.println(product);
    }
}
