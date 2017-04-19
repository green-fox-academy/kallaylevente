public enum Suits {
  CLUBS(2), DIAMONDS(3), HEARTS(4), SPADES(1);

  private int Suitpoints;

  Suits(int points) {

    this.Suitpoints = points;

  }

  public int getSuitspoints() {
    return this.Suitpoints;
  }

}