import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number =  s.nextInt();
        if(number % 2 == 0)
          System.out.println("Even");
        else
          System.out.println("Odd");
    }
} 
