public class Sharpie {
  public String color;
  public Float width;
  public Float inkAmount;

  public Sharpie(String color, Float width) {
    inkAmount = 100.f;
  }

  public Float use() {
    inkAmount = inkAmount - 10;
    return inkAmount;
  }
}
