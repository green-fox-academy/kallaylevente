
public class Animal {
  public int hunger;
  public int thirst;

  public Animal(){
    hunger = 50;
    thirst = 50;
  }

  public int eating() {
    hunger = hunger + 1;
    return hunger;
  }

  public int drink() {
    thirst = thirst + 1;
    return thirst;
  }

  public int[] play () {
    int[] play = new int[2];
    hunger = hunger + 1;
    thirst = thirst + 1;
    play[0] = hunger;
    play[1] = thirst;
    return play;
  }
}
