
public class Skeleton extends GameObject{
  private boolean isSkeleton;
  public Skeleton(int posX, int posY, boolean isSkeleton) {
    super(posX, posY, isSkeleton ? "assets/skeleton.png" : null);
  }

  public boolean isSkeleton() {
    return isSkeleton;
  }
}
