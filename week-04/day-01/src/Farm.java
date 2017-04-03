import java.util.ArrayList;

public class Farm {
  public ArrayList<Animal> animalList = new ArrayList<>();
  public int slot;

  public Farm() {
    animalList = new ArrayList<>();
    this.slot = 5;
  }

  public void breed() {
    if (slot > 0) {
      animalList.add(new Animal());
      slot--;
    }
  }

  public void slaughter() {
    int minNumber = 0;
    Animal minAnimal = new Animal();
    minAnimal.hunger = animalList.get(0).hunger;
    for (int i = 0; i < animalList.size(); i++) {
      if (animalList.get(i).hunger < minAnimal.hunger) {
        minAnimal.hunger = animalList.get(i).hunger;
        minNumber = i;
      }
    }
    animalList.remove(minNumber);
  }

}
