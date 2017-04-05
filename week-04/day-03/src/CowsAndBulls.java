import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CowsAndBulls {

  public static void main(String[] args) {
    String state = new String();
    int counter = 0;
    int num = 1000 + (int) (Math.random() * 9000);
    ArrayList<Integer> numList = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      numList.add(num % 10);
      num = num / 10;
    }
    ArrayList<Integer> guessList = new ArrayList<>();
    System.out.println("Please give me 4 number");
    Scanner scanner = new Scanner(System.in);
    int guess = scanner.nextInt();
    for (int i = 0; i < 4; i++) {
      guessList.add(guess % 10);
      guess = guess / 10;
    }

    for (int i = 0; i < 4; i++) {
      System.out.println(guessList.get(i));

    }








    }


}
