import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();        
        if(a % 15 == 0) System.out.println("HiHello"); 
        else if(a % 3 == 0) System.out.println("Hi"); 
        else System.out.println("Hello"); 
    }
}
