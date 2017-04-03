public class DiceGame {
  public static void main(String[] args) {
    Dice dice = new Dice();
    dice.roll();
    printer(dice);
    setToSix(dice);
    printer(dice);
  }

  public static void printer(Dice dice) {
    for (int i = 0; i < dice.getCurrent().length; i++) {
      System.out.print(dice.getCurrent(i) + " ");
    }
    System.out.println(" ");
  }

  public static Dice setToSix(Dice dice) {
    for (int i = 0; i < dice.getCurrent().length; i++) {
      while (dice.getCurrent(i) != 6) {
          dice.reroll(i);
        }
    }
    return dice;
  }
}
