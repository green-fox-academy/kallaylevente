import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

abstract class Command {
  public String parameterIndex1;
  public String paramterIndex2;
  public String parameter;
  public List<ListItem> todoList;

  abstract void execute();

  public Command() {
  }

  public Command(String parameterIndex1) {
    this.parameterIndex1 = parameterIndex1;
  }

  public String getParameter() {
    return parameter;
  }

  public void LoadToDos(){

  }

  public static List<ListItem> extractListItem(List<String> rawLines) {
    List<ListItem> listItems = new ArrayList<>();
    for (String lines : rawLines) {
      String[] splittedLines = lines.split(";");
      String task = splittedLines[0];
      listItems.add(new ListItem(task));
    }
    return listItems;
  }

  public static List<String> readInput() {
    List<String> rawLines;
    Path path = Paths.get("todos.csv");
    try {
      rawLines = Files.readAllLines(path);
    } catch (IOException e) {
      e.printStackTrace();
      rawLines = new ArrayList<>();
    }
    return rawLines;
  }
}
