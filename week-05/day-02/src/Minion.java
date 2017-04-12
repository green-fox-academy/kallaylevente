public class Minion {
  int HP;
  double DP;
  int posX;
  int posY;
  int SP;
  int Level;
  int x;
  int y;
  int ID;
  int CurrentHP;

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }


  public Minion(int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    CurrentHP = HP;
  }
}
