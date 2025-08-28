public class Main {
    public static void main(String[] args) {
       int a = 1, b = 2, c = 3, greatest;
       if(a > b && a > c) 
         greatest = a;
       else if(b > c) 
         greatest = b;
       else 
          greatest = c;
       System.out.println(greatest);
   }
}
      
