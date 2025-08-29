import java.util.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;        
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                count ++;
                System.out.print(i+",");
            }
        }
        System.out.print(n);
    }      
}
