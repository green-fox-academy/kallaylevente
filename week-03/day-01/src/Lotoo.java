import sun.nio.cs.ArrayEncoder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lotoo {

  public static void main(String[] args) {
    List<String> lines = new ArrayList<String>();
    try {
      Path path = Paths.get("otos.txt");      //// list of strings with every lines
      lines = Files.readAllLines(path);
    } catch (Exception e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }
    ArrayList<String> alistOfFiveNumber = new ArrayList<String>();
    String[] test = new String[16];
    //every splitted string into a strin[]

    for (int i = 0; i < lines.size(); i++) {
      test = lines.get(i).split(";");
      for (int j = 11; j < test.length; j++) {       // 5 numbers of every week is in the alist
        alistOfFiveNumber.add(test[j]);
      }
    }

    Map<String, Integer> frequency = new HashMap<String, Integer>();

    for (String word : alistOfFiveNumber) {
      Integer count = frequency.get(word);
      frequency.put(word, (count == null) ? 1 : count + 1);
    }

    List<Integer> topHit = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
      topHit.add(entry.getValue());
    }

    Collections.sort(topHit);
    Collections.reverse(topHit);
    ArrayList<Integer> top5Hit = new ArrayList<Integer>();
    top5Hit.addAll(topHit.subList(0, 5));     //the 5 top hit count

    for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
      if (top5Hit.contains(entry.getValue())) {
        System.out.println(entry.getKey());
      }

    }


  }

}



