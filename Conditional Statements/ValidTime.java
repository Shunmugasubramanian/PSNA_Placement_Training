import java.util.*;
public class Solution {
    public static void main(String[] args) {       
        Scanner s = new Scanner(System.in);
        String time = s.next();
        String[] t = time.split(":");
        int hr = Integer.parseInt(t[0]);
        int mn = Integer.parseInt(t[1]);
        int se = Integer.parseInt(t[2]);       
        if(hr >= 0 && hr < 24){
            if((mn >= 0 && mn < 60) && (se >= 0 && se < 60))
                System.out.println("Valid");
            else
                System.out.println("Not Valid");
        }
        else
            System.out.println("Not Valid");         
    }
}
