import java.util.*;
public class Solution {
    public static void main(String[] args) {       
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0, i = 2;
        while(n > 1) {
            if(n % i == 0) {
                count ++;
                n /= i;
            }
            else {
                if(count >= 1)
                    System.out.println(i+"->"+count);
                count = 0;
                i++;
            }
        }
        System.out.println(i+"->"+count);
    }
}
