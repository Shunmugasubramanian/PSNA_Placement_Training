import java.util.*;
public class Main {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int sum = n * (n + 1) / 2;  // O(1) Time Complexity
	    System.out.println(sum);
	}
} 
