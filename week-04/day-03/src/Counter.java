import java.util.ArrayList;

public class Counter {
  private ArrayList<Integer> aList;
  public Counter() {

  }

  public int sum(ArrayList<Integer> aList) {
    int sumOfList = 0;
    if (aList != null) {
      for (int i = 0; i < aList.size(); i++) {
        sumOfList = sumOfList + aList.get(i);
      }
      return sumOfList;
    } else {
      return 0;
    }
  }

}
