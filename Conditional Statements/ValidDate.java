import java.util.*;
public class Solution {
    public static void main(String[] args) {       
        Scanner s = new Scanner(System.in);
        String date = s.next();
        String[] dt = date.split("/");
        int dd = Integer.parseInt(dt[0]);
        int mm = Integer.parseInt(dt[1]);
        int yy = Integer.parseInt(dt[2]);
        
        if(yy >= 1900 && yy <= 9999) {
            if((mm == 1 || mm == 3 || mm== 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) && dd > 0 && dd < 32){
                System.out.println("Valid");
            }
            else if((mm == 4 || mm == 6 || mm == 9 || mm == 11) && dd > 0 && dd < 31){
                System.out.println("Valid");               
            }
            else if(mm == 2) {
                if((yy % 400 == 0 || (yy % 100 != 0 && yy % 4 == 0)) && dd > 0 && dd < 30)
                    System.out.println("Valid");
                else if(dd > 0 && dd < 29)
                    System.out.println("Valid");
                else
                    System.out.println("Invalid");
            }
            else
                System.out.println("Invalid");
        }
        else
            System.out.println("Invalid");
    }
}
