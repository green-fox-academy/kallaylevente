import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

abstract class Command {
  public String parameterIndex1;
  public String parameter0;
  public List<ListItem> todoList;

  public Command() {
  }

  abstract void execute();


  public static List<ListItem> extractListItem(List<String> rawLines) {
    List<ListItem> listItems = new ArrayList<>();
    for (String lines : rawLines) {
      String[] splittedLines = lines.split(";");
      String task = splittedLines[0];
      boolean isDone = splittedLines[1].equals("1");
      LocalDate date = LocalDate.parse(splittedLines[2], DateTimeFormatter.ofPattern("yyyy-MM-dd"));
      listItems.add(new ListItem(task,isDone,date));
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

  public static void writeToFile(List<ListItem> listItems) {
    List<String> data = new ArrayList<>();
    for (ListItem item : listItems) {
      data.add(item.toFile());
    }
    Path path = Paths.get("todos.csv");
    try {
      Files.write(path, data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public  void printItemsFromFile() {
    for (int i = 0; i < todoList.size(); i++) {
      System.out.println(i+1 + " - "  + todoList.get(i).toString());
    }
  }

  public String getParameter() {
    return parameter0;
  }

}
