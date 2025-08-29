import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int copy = n;
        int num=0, p = 1, rev = 0;
        int cubes, count = 0, cubeSum = 0;        
        while(n > 0) {
            n /= 10;
            p *= 10;
            count = count + 1;
        }
        p /= 10;        
        n = copy;        
        while(p > 0) {
            num = n / p;
            n %= p;
            p /= 10;
            cubes = Power(num,count);
            cubeSum = cubeSum + cubes;
        }        
        if(cubeSum == copy)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
  
    static int Power(int n,int c) {
            return (int)(Math.pow(n,c));
    }  
}
