import java.util.*;
public class ClosestPerson {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        
        int xs = Math.abs(x - z);
        int ys = Math.abs(y - z);
        
        System.out.println(xs);
        System.out.println(ys);
        if(xs < ys)
            System.out.println(1);
        else if(ys < xs) 
            System.out.println(2);
        else 
            System.out.println(0);
    }
}
