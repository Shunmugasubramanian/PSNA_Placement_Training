import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        String Name = s.next(); 
        int Age = s.nextInt(); 
        float CGPA = s.nextFloat(); 
        char Grade = s.next().charAt(0);
        
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("CGPA: "+Math.floor(CGPA*100)/100);
        System.out.println("Grade: "+Grade);  
    }
} 
