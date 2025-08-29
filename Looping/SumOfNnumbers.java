import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2, sum = 0;        
        for(i = 2; i <= n; i++){
            if(i % 2 == 0)
                sum += i;
        }
        System.out.println(sum);
    }
}
