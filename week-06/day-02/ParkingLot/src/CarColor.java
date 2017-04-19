public enum CarColor{
  RED(0),SILVER(1),BLACK(2),WHITE(3),YELLOW(4);

  private  int value;

  CarColor(int value) {
    this.value = value;
  }

  private static final int size = CarColor.values().length;

  public static int getSize() {
    return size;
  }
}
