import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int i, zc = 0;
        for(i = 0; i < n; i++) {
            a[i] = s.nextInt();
            if(a[i] == 0)
                zc++;
        }
        System.out.println("zc = "+zc);
        System.out.println("oc = "+(n-zc));
    }
}
