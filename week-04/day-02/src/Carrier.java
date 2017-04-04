import java.util.ArrayList;

public class Carrier  {
  private int storeOfAmmo;
  private int healthPoint;
  private ArrayList<Aircraft> aircraftList ;

  public ArrayList<Aircraft> getAircraftList() {
    return aircraftList;
  }

  public Carrier(int initialAmmo) {
    this.storeOfAmmo = initialAmmo;
    this.healthPoint = 1000;
    aircraftList = new ArrayList<>();
  }

  public void add_aircraft(String aircraftType) {
    if (aircraftType.equals("F35")){
      aircraftList.add(new F35());
    } else if (aircraftType.equals("F16")) {
      aircraftList.add(new F16());
    }
  }

  public void fill() {
    int ammmoNeeded = 0;
    for (int i = 0; i < this.aircraftList.size(); i++) {
      ammmoNeeded = ammmoNeeded  + aircraftList.get(i).track();
    }
    System.out.println(ammmoNeeded);

  }

}
