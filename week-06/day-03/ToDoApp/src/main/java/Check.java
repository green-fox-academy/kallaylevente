import java.time.LocalDate;

public class Check extends Command{
  private int chekParameter;

  public Check(String[] parameterIndex1) {
    this.parameter0 = "-c";

    try {
      this.chekParameter = Integer.parseInt(parameterIndex1[1]);
    } catch (Exception e){

    }

    this.todoList = extractListItem(readInput());
  }

  @Override
  void execute() {
    todoList.get(chekParameter - 1).setDone(true);
    todoList.get(chekParameter - 1).setDate(LocalDate.now());
    writeToFile(todoList);
    printItemsFromFile();
  }
}
