@interface  Monitor {

}

@Monitor
public class Screen {
  private int height;
  private int width;

  public Screen(int height, int width) {
    this.height = height;
    this.width = width;
  }
}
