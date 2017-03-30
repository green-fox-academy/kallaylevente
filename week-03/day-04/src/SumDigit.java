import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 30..
 */
public class SumDigit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.printf(Integer.toString(numberAdder(number)));
  }

  public static int numberAdder(int n) {
    int temp = n % 10;
    int value = 0;
    if (n == 0) {
      return 0 ;
    } else {
        value = temp + numberAdder(n = n / 10 );
        return value;
    }

  }

}

