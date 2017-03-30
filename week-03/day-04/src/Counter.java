import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(counter(n));

  }

  public static int counter(int number) {
    if (number == 0) {
      return 0;
    } else {
      System.out.println(number);
      return counter(number - 1);
    }
  }
}
