import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversOrder {
  public static void main(String[] args) {
    List<String> lines = new ArrayList<String>();
    try {
      Path filePath = Paths.get("reversed-order.txt");
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }
    String Size = Integer.toString(lines.size());

    ArrayList<String> aList = new ArrayList<>();
    for (int i = lines.size()-1; i >= 0 ; i--) {
      aList.add(0, lines.get(i));
      System.out.println(aList.get(0));
    }

  }
}
