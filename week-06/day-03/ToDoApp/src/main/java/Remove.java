public class Remove extends Command  {
    private int deleteParameter;

  public Remove(String[] parameterIndex1) {
    this.parameter0 = "-r";
    try {
      this.deleteParameter = Integer.parseInt(parameterIndex1[1]);
    } catch (Exception e){
    }
    this.todoList = extractListItem(readInput());
  }

  @Override
  void execute() {
    todoList.remove(deleteParameter - 1);
    writeToFile(todoList);
    printItemsFromFile();
  }
}
