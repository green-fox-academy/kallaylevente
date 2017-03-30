import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 30..
 */
public class StringSeparator {
  public static void main(String[] args) {
    System.out.printf("Give me the string");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    char to = '*';
    System.out.printf(replace(input ,to));
  }

  public static String replace(String s, char to){
    if (s.length()  < 1) {
      return " ";
    }
    else {
      String temp = new String();
      if (s.substring(1).length() > 0){
        temp = s.substring(0,1) + to;
      } else {
        temp = temp + s.substring(0, 1);
      }
      return temp + replace(s.substring(1), to);
    }
  }
}