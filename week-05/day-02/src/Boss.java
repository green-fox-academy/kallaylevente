public class Boss extends Minion {


  public Boss(int posX, int posY) {
    super(posX, posY);
    Level = 1;
    HP = 2 * Level * (((int) (Math.random() * 6) + 1) +((int) (Math.random() * 6) + 1)) ;
    DP = (Level % 2) * ((int) (Math.random() * 6) + 1) + (((int) (Math.random() * 6) + 1) / 2 );
    SP =  Level * (((int) (Math.random() * 6) + 1) + Level );
  }
}
