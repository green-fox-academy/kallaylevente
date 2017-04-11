public class Hero extends Minion {


  public Hero(int posX, int posY) {
    super(posX, posY);

    HP = 20 + 3 * ((int) (Math.random() * 6) + 1);
    DP = 2 * ((int) (Math.random() * 6) + 1);
    SP = 5 + ((int) (Math.random() * 6) + 1);
  }
}
