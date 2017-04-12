public class Skeleton extends Minion{


  public Skeleton(int skeletonPosX, int skeletonPosY) {
    super(skeletonPosX, skeletonPosY);
    Level = 1;
    HP = 2 * Level * ((int) (Math.random() * 6) + 1);
    DP = (Level % 2) * ((int) (Math.random() * 6) + 1);
    SP =  Level * ((int) (Math.random() * 6) + 1);
    CurrentHP = HP;
  }
}
