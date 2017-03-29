import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Levente on 2017. 03. 28..
 */
public class Encoder {
  public static void main(String[] args) {
    List<String> lines = new ArrayList<String>();
    try {
      Path filePath = Paths.get("encoded-lines.txt");
      lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Uh-oh, an error happend: " + e.getClass());
    }
    for (int i = 0; i < lines.size() ; i++) {
      char[] charArray = lines.get(i).toCharArray();
      for (int j = 0; j < charArray.length ; j++) {
        if (charArray[j] != ' ') {
          char letter = charArray[j];
          letter--;
          charArray[j] = letter;

        }
        System.out.print(charArray[j]);
      }
      System.out.println();
    }
  }


}
