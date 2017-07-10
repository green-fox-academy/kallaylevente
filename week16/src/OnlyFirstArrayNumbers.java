import java.util.ArrayList;
import java.util.List;

public class OnlyFirstArrayNumbers {

  public static void main(String[] args) {
    List<Integer> listA =listA = fillListAWithNumbers();
    List<Integer> listB = listB = fillListBWithNumbers();
    for (Integer temp : returnFirstListsIntegerOnly(listA, listB)) {
      System.out.println(temp);
    }
  }

  private static List<Integer> returnFirstListsIntegerOnly(List<Integer> listA, List<Integer> listB) {
    List<Integer> returnList = new ArrayList<>();
    for (int i = 0; i < listA.size() ; i++) {
      if (!listB.contains(listA.get(i))) {
        returnList.add(listA.get(i));
      }
    }
    return returnList;
  }

  private static List<Integer> fillListAWithNumbers() {
    List<Integer> listA = new ArrayList<>();
    listA.add(1);
    listA.add(2);
    listA.add(3);
    listA.add(4);
    return listA;
  }

  private static List<Integer> fillListBWithNumbers() {
    List<Integer> listB = new ArrayList<>();
    listB.add(3);
    listB.add(4);
    listB.add(5);
    listB.add(6);
    return listB;
  }
}


//Create a function that takes two list of
// numbers and returns a new list that only consists those numbers that are in the first array but not in the second
