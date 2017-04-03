public class FleetOfThings {

  public static void main(String[] args) {
    Thing milk = new Thing("Get milk");
    Thing obstacles = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up");
    Thing lunch = new Thing("Eat lunch");
    standUp.complete();
    lunch.complete();
    Fleet fleet = new Fleet();
    fleet.add(milk);
    fleet.add(obstacles);
    fleet.add(standUp);
    fleet.add(lunch);
    System.out.println(fleet);
  }
}