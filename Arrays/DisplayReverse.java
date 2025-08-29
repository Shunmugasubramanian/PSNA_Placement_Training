import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int i;
        for(i = 0; i < n; i++)
            a[i] = s.nextInt();
        for(i = n-1; i >= 0; i--)
            System.out.print(a[i]+" ");
    }
}
