public class Main {
  public static void main(String[] args) {
    int a = 10, b = 20;

    //using temporary variable
    int temp = a;
    a = b;
    b = a;

    //without using temporary variable
    //by add and sub
    a = a + b;
    b = a - b;
    a = a - b;

    //by mul and div
    a = a * b;
    b = a / b;
    a = a / b;

    //by XOR
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println(a+" "+b);
  }
}
