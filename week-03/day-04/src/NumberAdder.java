import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 30..
 */
public class NumberAdder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.printf(Integer.toString(counter(number)));
  }

  public static int counter(int n) {
    int value = 0;
    if (n == 0){
      return 0;
    } else {
      value = n + counter(n - 1);
      return value;
    }
  }
}
