import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Practice {
  public static void main(String[] args) {
    List<String> lines = new ArrayList<String>();
    try {
      Path filePath = Paths.get("otos.txt");
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Something goes wrong");
    }
    ArrayList<String> value = new ArrayList<String>();
    for (int i = 0; i < lines.size() ; i++) {
      String[] numbers = lines.get(i).split(";");
      for (int j = 11; j <  16; j++) {
        value.add(numbers[j]);
      }
    }                 // valu is filled with all the numbers

    Map<String, Integer> freq = new HashMap<String, Integer>();
    for(String word: value) {
      Integer count = freq.get(word);
      freq.put(word, (count==null) ? 1 : count+1);
    }

  //  for (Map.Entry<String, Integer> entry : freq.entrySet()) {
  //    System.out.println(entry.getKey()+" : "+entry.getValue());
  //  }

    ArrayList<Integer> freqS = new ArrayList<Integer>();
    for(Map.Entry<String, Integer> entry: freq.entrySet()) {
      freqS.add(entry.getValue());
    }

  //  for (int i = 0; i < freqS.size(); i++) {
  //    System.out.println(freqS.get(i));
  //  }

    Collections.sort(freqS);
    Collections.reverse(freqS);
    ArrayList<Integer> top5 = new ArrayList<Integer>();
    for (int i = 0; i < 5 ; i++) {
      top5.add(freqS.get(i));
    }

   // for (int i = 0; i < top5.size(); i++) {
    //  System.out.println(top5.get(i));
   // }

    for (Map.Entry<String, Integer> entry : freq.entrySet()) {
      if (top5.contains(entry.getValue())) {
        System.out.println(entry.getKey() + "/" + entry.getValue());
      }
    }

  }
}