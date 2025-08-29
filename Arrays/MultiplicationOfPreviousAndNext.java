import java.util.*;
public class Solution {
    public static void main(String[] args) {   
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int i, mul = 1;
        for(i = 0; i < n; i++) 
            a[i] = s.nextInt();
        for(i = 0; i < n; i++) {
            if(i == 0) {
                mul = a[i] * a[i + 1];
                System.out.print(mul+" ");
            }
            else if(i == n-1) {
                mul = a[i] * a[i-1];
                System.out.print(mul+" ");
            }
            else {
                mul = a[i - 1] * a[i + 1];
                System.out.print(mul+" ");
            }
        }
    }
}
