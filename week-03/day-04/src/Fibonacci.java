import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    System.out.println("Plea give the number");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(Integer.toString(fibonacci(number)));
  }

  public static int fibonacci(int n) {
    int  value = 0;
    if (n == 0) {
      return 0;
    } else if (n == 1) {

      return 1;
    }else {
      value = fibonacci(n - 1) + fibonacci(n - 2);
      return value;
    }

  }
}
