import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int i, count = 0;
        for(i = 0; i < n; i++) {
            a[i] = s.nextInt();
            if(a[i] % 2 == 0)
                count++;
        }
        System.out.println("Odd = "+(n-count));
        System.out.println("Even = "+(count));
    }
}
