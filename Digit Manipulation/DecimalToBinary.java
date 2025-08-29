import java.util.*;
public class Solution {
    public static void main(String[] args) {       
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num, p = 1, bi = 0;       
        while(n > 0) {
            num = n % 2;
            n /= 2;
            bi = bi + num * p;
            p = p * 10;
        }
        System.out.print(bi+" ");
    }
}
