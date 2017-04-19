import java.util.Scanner;

/**
 * Created by Levente on 2017. 04. 19..
 */
public class SplitString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int splitIndex = scanner.nextInt();
    Scanner scanner1 = new Scanner(System.in);
    String inputString = scanner1.nextLine();
    String[] splittedStrings = stringSplitter(inputString, splitIndex );

    for (int i = 0; i < splittedStrings.length; i++) {
      System.out.println(splittedStrings[i]);
    }
  }

  public static String[] stringSplitter(String input, int splitIndex) {
    String[] splittedString = new String[2];
    try {
      splittedString[0] = input.substring(0, splitIndex);
      splittedString[1] = input.substring(splitIndex, input.length());
    } catch (IndexOutOfBoundsException e) {
      System.out.println("given number is bigger than the length of the given string");
      splittedString[0] = ("given string is " + input);
      splittedString[1] = ("given number was " + splitIndex + "while biggest should be: " + input.length());
    }
    return splittedString;

  }


}