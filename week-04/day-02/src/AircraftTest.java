
public class AircraftTest {
  public static void main(String[] args) {
    Aircraft testAircraft = new Aircraft();
    testAircraft.setCurrentAmmo(10);
    F35 testF35 = new F35();
    testF35.refill(100);
    System.out.println(testF35.get_status());
    F16 testF16 = new F16();
    System.out.println(testF16.track());
    testF16.refill(100);
    System.out.println(testF16.get_status());

    Carrier testCarrier = new Carrier(1000);
    testCarrier.add_aircraft("F35");
    testCarrier.add_aircraft("F35");
    testCarrier.add_aircraft("F16");
    testCarrier.add_aircraft("F16");
    System.out.println(testCarrier.getAircraftList().size());




  }


}
