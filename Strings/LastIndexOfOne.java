import java.util.*;
public class LastIndexOfOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        for(i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == '1') {
                System.out.print(i);
                break;
            }
        }
    }
}
