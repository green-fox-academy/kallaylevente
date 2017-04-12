
public class Skeleton extends GameObject{
  private int HP;
  private double DP;
  private int SP;
  private int currentHP;

  private boolean isSkeleton;

  public Skeleton(int posX, int posY, boolean isSkeleton) {
    super(posX, posY, isSkeleton ? "assets/skeleton.png" : null);
    this.HP = 2 * ((int) (Math.random() * 6) + 1);
    this.DP = .5  *((int) (Math.random() * 6) + 1);
    this.SP = ((int) (Math.random() * 6) + 1);

  }

  public boolean isSkeleton() {
    return isSkeleton;
  }



}
