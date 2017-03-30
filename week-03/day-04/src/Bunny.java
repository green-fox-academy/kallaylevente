import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 30..
 */
public class Bunny {
  public static void main(String[] args) {
    System.out.printf("Give me the number of bunnies");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.printf(Integer.toString(earCounter(number)));
  }

  public static int earCounter (int n) {
    int value = 0;
    if (n == 0) {
      return 0;
    } else {
      value = 2 + earCounter(n-1);
      return value;
    }
  }
}
