import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int i, sum = 0;
        for(i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum += a[i];
        }
        System.out.print(sum);
    }
}
