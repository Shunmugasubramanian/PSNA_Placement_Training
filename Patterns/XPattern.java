import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1 = 2*n-1;
        int i, j;        
        for(i = 1; i <= n1; i++) {
            for(j = 1; j <= n1; j++) {
                if(i == j || i + j == n1 + 1)
                    System.out.print("*")
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
