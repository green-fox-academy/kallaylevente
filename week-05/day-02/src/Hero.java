
public class Hero extends Minion{

  public Hero() {

  }

  public Hero(String filename, int posX, int posY) {
    super(filename, posX, posY);
    HP = 20 + 3 * d61;
    DP = 2 * d62;
    SP = 5 + d63;
    Level = 1;
  }
}
