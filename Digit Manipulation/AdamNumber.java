import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);        
        int n = s.nextInt();
        int rev = reverse(n); 
        int copy = n;       
        int nS = square(copy);
        int rS = square(rev);        
        int sqR = reverse(nS);        
        if(sqR == rS) {
            System.out.print("Adam Number");
        }
        else {
            System.out.print("Not a adam number");
        }
    }
  
    static int square(int num) {
        return num * num;
    }
  
    static int reverse(int n) {
        int digit, rev1 = 0;
        while(n > 0) {
            digit = n % 10;
            rev1 = rev1 * 10 + digit;
            n /= 10;
        }
        return rev1;
    }
}
