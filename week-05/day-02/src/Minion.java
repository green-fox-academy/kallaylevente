public class Minion  extends PositionedImage{
  static int HP ;
  static int DP;
  static int SP;
  static int Level;
  static int d61 = ((int)((1 + (Math.random() * 5))));
  static int d62 = ((int)((1 + (Math.random() * 5))));
  static int d63 = ((int)((1 + (Math.random() * 5))));
  public Minion() {

  }



  public int getHP() {
    return HP;
  }

  public int getDP() {
    return DP;
  }

  public int getSP() {
    return SP;
  }

  public int getLevel() {
    return Level;
  }

  public Minion(String filename, int posX, int posY) {
    super(filename, posX, posY);
  }
}
