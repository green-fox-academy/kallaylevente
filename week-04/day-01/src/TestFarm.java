
public class TestFarm {
  public static void main(String[] args) {
    Farm mucsa = new Farm();
    System.out.println(mucsa.slot);
    mucsa.breed();
    System.out.println(mucsa.slot);
    System.out.println(mucsa.animalList.size());
    for (int i = 0; i < mucsa.animalList.size() ; i++) {
      System.out.println(mucsa.animalList.get(i).hunger);
    }
  }
}
