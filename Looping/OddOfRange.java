import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        for(i = 1; i <= n; i++) {
            if(i % 2 != 0)
                System.out.print(i+" ");
        }
    }
}
