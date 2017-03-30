import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 30..
 */
public class Power {
  public static void main(String[] args) {
    System.out.printf("Give me the base number");
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    System.out.printf("Give me the n number");
    int number2 = scanner.nextInt();
    System.out.println(Integer.toString(power(number1,number2)));
  }
  public static int power(int n1, int n2) {
    int value = 0;
    if (n2 == 0) {
      return 1;
    } else {
      value = n1 * power(n1,n2-1);
      return value;
    }
  }
}
