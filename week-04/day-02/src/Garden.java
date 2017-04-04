import java.util.ArrayList;
import java.util.List;

public class Garden {
  public static void main(String[] args) {
      List<Plants> gardenPlants = new ArrayList<>();
      Plants testPlant = new Plants(12,"black");
      testPlant.waterLimit = 11;
      testPlant.info();

      Flower testFlower = new Flower(4,"red");
      Tree testTree = new Tree(11,"brown");
      gardenPlants.add(testFlower);
      gardenPlants.add(testTree);

      



    }

    public static int counter(List<Plants> plantList) {
    int counter = 0;
      for (int i = 0; i < plantList.size(); i++) {
        if (plantList.get(i).isNeed()) {
          counter++ ;
        }
      }
      return counter;
    }

}
