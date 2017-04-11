public class Hero extends Minion{
  static int HP ;

  public static int getHP() {
    return HP;
  }

  public Hero(int posX, int posY) {
    super(posX, posY);

    HP = 20 + ((int) (Math.random() * 6) + 1);

  }
}
