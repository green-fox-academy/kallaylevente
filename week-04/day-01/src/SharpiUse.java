
public class SharpiUse {

  public static void main(String[] args) {
    Sharpie sharp = new Sharpie("red", 15.f);
    sharp.use();
    System.out.println(sharp.inkAmount);
  }
}
