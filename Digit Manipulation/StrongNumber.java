import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int digit, factorial,factSum = 0;
        int copy = n;       
        while(n > 0) {
            digit = n % 10;
            n /= 10;
            factorial = fact(digit);
            factSum += factorial;
        }
        if(factSum == copy)
            System.out.println("Strong Number");
        else
            System.out.println("Not a strong number");
    }
    
    static int fact(int n) {
        if(n == 0 || n == 1) 
            return n;
        else
            return n * fact(n-1);
    }
}
