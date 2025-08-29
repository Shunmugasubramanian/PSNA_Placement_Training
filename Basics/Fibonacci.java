import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int a = 0, b = 1, c;
	    int n = s.nextInt();
	    if(n == 1 || n == 0) {
	        System.out.print(n+" ");
	    }
		  for(int i = 2; i <= n; i++) {
		      c = a + b;
		      a = b;
		      b = c;
		  }
		  System.out.println(a);   //Last Value of Fibonacci number of 'N'
	}
}
