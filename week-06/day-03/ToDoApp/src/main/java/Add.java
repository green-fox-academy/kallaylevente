import java.time.LocalDate;

public class Add extends Command {

  public Add(String[] parameterIndex1) {
    try {
      this.parameterIndex1 = parameterIndex1[1];
    } catch (IndexOutOfBoundsException e){

    }

    this.parameter0 = "-a";
    this.todoList = extractListItem(readInput());
  }


  @Override
  void execute() {
    LocalDate date = LocalDate.now();
    todoList.add(new ListItem(parameterIndex1, false,date));
    writeToFile(todoList);
    printItemsFromFile();
  }
}
