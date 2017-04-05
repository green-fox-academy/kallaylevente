public class Animal {
  private int hunger;
  private int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public int eating() {
    hunger = hunger + 1;
    return hunger;
  }

  public int drink() {
    thirst = thirst + 1;
    return thirst;  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }

  public void play() {
    this.hunger = hunger + 1;
    this.thirst = thirst + 1;

  }
}
