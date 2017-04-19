import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> cardList = new ArrayList<>();

  public Deck() {
    cardList = fillDeck();
  }

  public List<Card> getCardList() {
    return cardList;
  }

  public List<Card> fillDeck() {
    List<Card> deck = new ArrayList<>();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 13 ; j++) {
        Card card = new Card(Suits.values()[i],Rank.values()[j]);

        deck.add(card);
      }
    }
    return deck;
  }

  public void shuffle(){
    Collections.shuffle(cardList);
  }

  public Card pullFirst() {
    Card tempCard = cardList.get(0);
    cardList.remove(0);
    return tempCard;
  }

  public Card pullLast() {
    Card tempCard = cardList.get(cardList.size()-1);
    cardList.remove(cardList.size()-1);
    return tempCard;
  }

  public Card pullRandom() {
    int randomCard = (int)(Math.random() * 52);
    Card tempCard = cardList.get(randomCard);
    cardList.remove(randomCard);
    return tempCard;
  }

}
