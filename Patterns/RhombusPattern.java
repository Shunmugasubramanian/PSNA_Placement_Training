import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i,space,star;        
        for(i = 1; i <= n; i++) {
            for(space = 1; space <= n-i; space++) 
                System.out.print(" ");
            for(star = 1; star <= n; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}
