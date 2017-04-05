public class Sharpie {
  public String color;
  public Float width;
  public Float inkAmount;

  public Sharpie(String color, Float width) {
    inkAmount = 100.f;
  }

  public Float getInkAmount() {
    return inkAmount;
  }

  public void use() {
    this.inkAmount = inkAmount - 10.f;
  }
}