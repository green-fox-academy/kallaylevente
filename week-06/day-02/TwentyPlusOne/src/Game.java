import java.util.Arrays;

public class Game {
  public static void main(String[] args) {
    Deck testDeck = new Deck();

    testDeck.shuffle();
    System.out.println(testDeck.pullFirst().toString());
    System.out.println(testDeck.pullLast().toString());
    System.out.println(testDeck.pullRandom().toString());

    System.out.println(testDeck.getCardList().size());

    

  }

  public static int pointsOfTheDealer() {
    return (int)(15 + Math.random() * 7);
  }
}
