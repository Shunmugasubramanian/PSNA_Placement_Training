import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();       
        int i, space, star;        
        for(i = n; i >= 1; i--) {
            for(space = 1; space <= n-i; space++) 
                System.out.print(" ");
            for(star = 1; star <= 2*i-1 ; star++) 
                System.out.print("*");
            System.out.println();
        }
    }
}
