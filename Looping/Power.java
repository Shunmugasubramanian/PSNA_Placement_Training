import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int pow = 1;        
        for(int i = 1; i <= n2; i++) {
            pow = pow * n1;
        }
        System.out.println(pow);
    }
}
