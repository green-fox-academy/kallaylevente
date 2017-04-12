
public class Boss extends GameObject{
  private boolean isBoss;
  private int HP;
  private double DP;
  private int SP;
  private int currentHP;

  public Boss(int posX, int posY, boolean isBoss  ) {
    super(posX, posY, isBoss ? "assets/boss.png" : null);
    this.HP = 2 * ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
    this.DP = .5  *((int) (Math.random() * 6) + 1) + + Math.round(((int) (Math.random() * 6) + 1) / 2);
    this.SP = ((int) (Math.random() * 6) + 1);
  }

  public boolean isBoss() {
    return isBoss;
  }
}
