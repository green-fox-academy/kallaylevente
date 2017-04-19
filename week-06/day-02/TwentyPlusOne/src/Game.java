import java.util.Arrays;

public class Game {
  public static void main(String[] args) {
    Deck testDeck = new Deck();


    for (int i = 0; i < testDeck.getCardList().size() ; i++) {
      System.out.println(testDeck.getCardList().get(i).toString());
    }
  }
}
