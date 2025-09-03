import java.util.*;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int copy = n;
        int num, sum = 0;
        while(copy > 0) {
            num = copy % 10;
            copy /= 10;
            sum += num;
        }
        if(n % sum == 0) System.out.println(sum);
        else System.out.println("-1");
    }
}
