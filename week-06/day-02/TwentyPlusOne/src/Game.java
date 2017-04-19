import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    Deck testDeck = new Deck();
    int dealerValue = pointsOfTheDealer();
    System.out.printf("The hous is at: %d \n", dealerValue);
    Scanner scanner = new Scanner(System.in);

    String currentScannerValue ;
    int heroValue = 0;
    do {
      System.out.printf("Your current value is: %d \n", heroValue);
      System.out.println("Do you want to pull more?");
      currentScannerValue = scanner.nextLine();
      if (currentScannerValue.equals("y")) {

        heroValue = heroValue + testDeck.pullRandom().getRank().getRankpoints();
        System.out.println(heroValue);
      }

    } while (!currentScannerValue.equals("n") && heroValue <= 21);

    if (dealerValue >= heroValue || heroValue > 21) {
      System.out.println("The house wins!");
    } else {
      System.out.println("You win!");
    }

  }

  public static int pointsOfTheDealer() {
    return (int) (15 + Math.random() * 7);
  }
}