
public class Boss extends GameObject{
  private boolean isBoss;
  public Boss(int posX, int posY, boolean isBoss  ) {
    super(posX, posY, isBoss ? "assets/boss.png" : null);
  }

  public boolean isBoss() {
    return isBoss;
  }
}
