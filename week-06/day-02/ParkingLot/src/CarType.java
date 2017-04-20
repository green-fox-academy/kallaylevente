public enum CarType {
  OPEL(0), MAZDA(1), MERCEDES(2), BMW(3), SUZUKI(4), FORD(5);

  private int value;

  CarType(int value) {
    this.value = value;
  }

  private static final int size = CarType.values().length;

  public static int getSize() {
    return size;
  }

}
