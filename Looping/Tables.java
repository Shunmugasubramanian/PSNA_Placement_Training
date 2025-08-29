import java.util.*;
public class Solution {
    public static void main(String[] args) {      
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int i;
        for(i = 1; i <= n1; i++){
            System.out.println(i+" * "+n2+" = "+(i*n2));
        }
    }
}
