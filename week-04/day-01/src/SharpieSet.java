import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet() {

  }

  public int countUsable(List<Sharpie> sharpi) {
    int counter = 0;
    for (int i = 0; i < sharpi.size() ; i++) {
      if (sharpi.get(i).inkAmount > 0 ) {
        counter ++;
      }

    }
    return counter;
  }

  public ArrayList<Sharpie> removeTrash(List<Sharpie> sharpi){
    ArrayList<Sharpie> removedList = new ArrayList<>();
    for (int i = 0; i < sharpi.size() ; i++) {
      if (sharpi.get(i).inkAmount > 0 ) {
        removedList.add(sharpi.get(i));
      }
    }
    return removedList;
  }
}
