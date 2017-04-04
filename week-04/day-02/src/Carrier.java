import java.util.ArrayList;
import java.util.Collections;

public class Carrier  {
  public int getHealthPoint() {
    return healthPoint;
  }

  public void setHealthPoint(int healthPoint) {
    this.healthPoint = healthPoint;
  }

  private int storeOfAmmo;
  private int healthPoint;
  private ArrayList<Aircraft> aircraftList ;

  public ArrayList<Aircraft> getAircraftList() {
    return aircraftList;
  }

  public int getStoreOfAmmo() {
    return storeOfAmmo;
  }

  public void setStoreOfAmmo(int storeOfAmmo) {
    this.storeOfAmmo = storeOfAmmo;
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

  public void fill() {    //third case not done jet
    int ammmoNeeded = 0;
    for (int i = 0; i < this.aircraftList.size(); i++) {
      ammmoNeeded = ammmoNeeded  + aircraftList.get(i).track();
    }
    if (this.storeOfAmmo == 0 ) {
      System.out.println("this should be an exception");
    } else if (this.storeOfAmmo > ammmoNeeded) {
      for (int i = 0; i < this.aircraftList.size(); i++) {
        aircraftList.get(i).setCurrentAmmo(aircraftList.get(i).track());
      }
      this.storeOfAmmo = this.storeOfAmmo - ammmoNeeded;
    }

  }

  public void fight(Carrier carrier) {
    int damage = 0;
    for (int i = 0; i < this.aircraftList.size(); i++) {
      damage = damage + this.aircraftList.get(i).getCurrentAmmo() * this.aircraftList.get(i).getBaseDamage();
    }
    carrier.setHealthPoint(carrier.getHealthPoint() - damage);
    if (carrier.getHealthPoint() <= 0 ) {
      System.out.println("It's dead JIm :(");
    }
  }

  public void get_status() {
    int count = aircraftList.size();
    int damage = 0;
    for (int i = 0; i < this.aircraftList.size(); i++) {
      damage = damage + this.aircraftList.get(i).getCurrentAmmo() * this.aircraftList.get(i).getBaseDamage();
    }
    System.out.println("Aircraft count: " + count + ", Ammo Storage: " + getStoreOfAmmo() + ", Total Damage: " + damage);
    System.out.println("Aircrafts: ");
    for (int i = 0; i < this.aircraftList.size(); i++) {
      System.out.println(aircraftList.get(i).get_status());
    }



  }

}
