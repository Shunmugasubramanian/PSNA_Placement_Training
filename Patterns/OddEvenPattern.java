import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, j, val;        
        for(i = 1; i <= n; i++) {
            if(i % 2 != 0)
                val = 1;
            else 
                val = 2;
            for(j = 1; j <= i; j++) {   
                System.out.print(val);
                val = val + 2;
            }
            System.out.println();
        }
    }
}
