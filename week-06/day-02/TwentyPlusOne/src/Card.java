public class Card {
  private Color color;
  private Suits suit;
  private Rank rank;

  public Card(Suits suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public String toString() {
    return (suit + "  " + rank);
  }

  public Rank getRank() {
    return rank;
  }
}
