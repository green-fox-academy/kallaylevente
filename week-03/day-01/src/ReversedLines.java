import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    List<String> lines = new ArrayList<String>();
    try {
      Path filePath = Paths.get("reversed.txt");
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }
    
    ArrayList<String> lineArray = new ArrayList<String>();
    for (int i = 0; i < lines.size() ; i++) {
      lineArray.add(lines.get(i));
    }

    for (int i = 0; i < lineArray.size(); i++) {
      StringBuilder sb =  new StringBuilder(lineArray.get(i));
      sb = sb.reverse();
      lineArray.set(i, sb.toString());
    }

    for (int i = 0; i < lineArray.size() ; i++) {
      System.out.println(lineArray.get(i));
    }

  }
}
