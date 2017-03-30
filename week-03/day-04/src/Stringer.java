import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 30..
 */
public class Stringer {
  public static void main(String[] args) {
    System.out.printf("Give me the string");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    char from = 'x';
    char to = 'y';
    System.out.printf(replace(input ,from ,to));
  }

  public static String replace(String s, char from, char to){
    if (s.length() < 1) {
      return s;
    }
    else {
      char first = from == s.charAt(0) ? to : s.charAt(0);
      return first + replace(s.substring(1), from, to);
    }
  }
}
