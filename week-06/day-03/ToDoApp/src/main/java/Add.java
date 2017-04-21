public class Add extends Command {

  public Add(String parameterIndex1) {
    this.parameterIndex1 = parameterIndex1;
    this.parameter = "-a";
    this.todoList = extractListItem(readInput());
  }


  @Override
  void execute() {
    todoList.add(new ListItem(parameterIndex1));
    for (int i = 0; i < todoList.size() ; i++) {
      System.out.println(todoList.get(i).toString());
    }

  }
}
