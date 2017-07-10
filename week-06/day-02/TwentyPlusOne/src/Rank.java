public enum Rank {
  DEUCE(12), THREE(11), FOUR(10), FIVE(9), SIX(8), SEVEN(7), EIGHT(6), NINE(
    5), TEN(4), JACK(3), QUEEN(2), KING(1), ACE(0);

  private int Rankpoints;

  Rank(int points) {
    this.Rankpoints = points;
  }

  public int getRankpoints() {
    return this.Rankpoints;
  }
}