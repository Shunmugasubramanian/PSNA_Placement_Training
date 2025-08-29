import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n1 = s.nextInt();
	    int n2 = s.nextInt();
		  for(int i = n1; i <= n2; i++) {
		     if(isSpecialNumber(i))
		        System.out.print(i+" ");
		  }
	}
  
	public static boolean isSpecialNumber(int n) {
	    int copy = n;
	    int num, add = 0, mul = 1;           
	    while(n > 0) {                     
	        num = n % 10;                    
	        add +=  num;                    
	        mul *= num;                    
	        n /= 10;           
	    }
	    if(copy == (add+mul))
	        return true;
	    return false;
	} 
}
