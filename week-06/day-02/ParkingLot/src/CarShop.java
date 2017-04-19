import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CarShop {
  public static void main(String[] args) {
    List<Car> carList = new ArrayList<>();

    for (int i = 0; i < 256; i++) {
      int randomTypeNumber = (int) (Math.random() * CarType.getSize());
      int randomColorNumber = (int) (Math.random() * CarColor.getSize());
      carList.add(new Car(CarType.values()[randomTypeNumber], CarColor.values()[randomColorNumber]));
    }

    Map<CarColor, Integer> colorFrequency = new HashMap<>();

    for (int i = 0; i < carList.size(); i++) {
      Integer count = colorFrequency.get(carList.get(i).getColor());
      colorFrequency.put(carList.get(i).getColor(), (count == null) ? 1 : count + 1);
    }

    Map<CarType, Integer> typeFrequency = new HashMap<>();

    for (int i = 0; i < carList.size(); i++) {
      Integer count = typeFrequency.get(carList.get(i).getType());
      typeFrequency.put(carList.get(i).getType(), (count == null) ? 1 : count + 1);
    }

    System.out.println("COLORFREQUENCY");

    for (CarColor name : colorFrequency.keySet()) {
      String key = name.toString();
      String value = colorFrequency.get(name).toString();
      System.out.println(key + " " + value);
    }

    System.out.println("TYPEFREQUENCY");

    for (CarType name : typeFrequency.keySet()) {
      String key = name.toString();
      String value = typeFrequency.get(name).toString();
      System.out.println(key + " " + value);
    }

    Integer max  = 0;
    for (Map.Entry<CarType, Integer> type : typeFrequency.entrySet()) {
      if (max < type.getValue()) {
        max = type.getValue();
      }
    }


    for (Map.Entry<CarType, Integer> type : typeFrequency.entrySet()) {
      if (max == type.getValue()) {
        System.out.println("The most common car type is: " + type.getKey().toString());
      }
    }

  }
}
