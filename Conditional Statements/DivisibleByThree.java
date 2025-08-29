import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();        
        if(a % 3 == 0) 
            System.out.println("The number is divisible by 3");
        else 
            System.out.println("The number is not divisible by 3 and gives a remainder "+(a%3));
    }
}
