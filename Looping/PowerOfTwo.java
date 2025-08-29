import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = 1, flag = 0;
        while (n >= p) {
            if (n == p) flag = 1;
            p *= 2;
        }
        if(flag == 1) System.out.println("YES");
        else System.out.println("NO");
    }
}
