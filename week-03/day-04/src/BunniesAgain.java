import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 30..
 */
public class BunniesAgain {
  public static void main(String[] args) {
    System.out.printf("Give me the number of bunnies");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.printf(Integer.toString(earCounter2(number)));
  }

  public static int earCounter2(int n) {
    int value = 0;
    if (n == 0) {
      return 0;
    } else if ((n % 2) == 0){
      value = 3 + earCounter2(n-1);
    } else {
      value = 2 + earCounter2(n-1);
    }return  value;

  }
}
