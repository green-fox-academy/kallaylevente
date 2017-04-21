public class ListItems extends Command {

  public ListItems() {
    this.parameter0 = "-l";
    this.todoList = extractListItem(readInput());
  }

  @Override
  void execute() {
    if (todoList.size() == 0) {
      System.out.println("No todos for today :)");
    } else {
      printItemsFromFile();
    }
  }
}
