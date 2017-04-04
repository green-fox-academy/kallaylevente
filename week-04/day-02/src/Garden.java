import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garden {
  public static void main(String[] args) {
    ArrayList<Plants> gardenPlants = makeList();
    infoOnList(gardenPlants);
    System.out.println("give me the amount of rain");
    double rain = scanner();
    int counter = counter(gardenPlants);
    watering(gardenPlants,rain);
  }

  public static int counter(List<Plants> plantList) {
    int counter = 0;
    for (int i = 0; i < plantList.size(); i++) {
      if (plantList.get(i).isNeed()) {
        counter++;
      }
    }
    return counter;
  }

  public static double scanner() {
    int number;
    Scanner scanner = new Scanner(System.in);
    number = scanner.nextInt();
    return number;
  }

  public static ArrayList<Plants> makeList(){
    ArrayList<Plants> gardenPlants = new ArrayList<>();
    Flower rose = new Flower(4, "red");
    Flower orchid = new Flower(6, "red");
    Tree quercus = new Tree(9, "brown");
    Tree oak = new Tree(7, "brown");
    gardenPlants.add(rose);
    gardenPlants.add(orchid);
    gardenPlants.add(quercus);
    gardenPlants.add(oak );
    return gardenPlants;
  }

  public static void watering(ArrayList<Plants> gardenPlants,double rain) {
    System.out.println("Watering with " + rain);
    for (int i = 0; i < gardenPlants.size() ; i++) {
      if (gardenPlants.get(i).isNeed()) {
        gardenPlants.get(i).watering((rain / ((double)counter(gardenPlants))));
      }
      gardenPlants.get(i).info();
    }
  }

  public static void infoOnList(ArrayList<Plants> plants) {
    for (int i = 0; i < plants.size(); i++) {
      plants.get(i).info();
    }
  }
}
