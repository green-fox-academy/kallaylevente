public enum Color {
  RED(0),BLACK(1);

private int colorPoints;

  Color(int colorPoints) {
    this.colorPoints = colorPoints;
  }

  public int getColorPoints() {
    return colorPoints;
  }
}
