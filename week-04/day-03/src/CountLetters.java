import java.util.HashMap;
import java.util.Map;

public class CountLetters {
  private HashMap<String, Integer> myMap ;

  public CountLetters() {
    this.myMap = new HashMap<String,Integer>();
  }

  public Map<String,Integer> countLetters(String string) {
    this.myMap = new HashMap<String,Integer>();
    for (int i = 0; i < string.length(); i++) {
      Integer count = myMap.get(string.substring(i,i+1));
      System.out.println(count);
      myMap.put(string.substring(i,i+1), (count == null) ? 1 : count + 1);
    }
    return myMap;
  }
}
