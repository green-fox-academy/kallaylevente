import java.util.ArrayList;
import java.util.List;

public class CommandList {
  List<Command> listOfCommands;
  String[] arguments;

  public CommandList(String[] args) {
    this.arguments = args;
    this.listOfCommands = new ArrayList<>();
    fillListWithCommands(listOfCommands);
  }

  public void fillListWithCommands(List<Command> listOfCommands){
    listOfCommands.add(new Add(arguments));
    listOfCommands.add(new Remove(arguments));
    listOfCommands.add(new Check(arguments));
    listOfCommands.add(new ListItems());

  }

  public Command getCommand(String parameter) {
    Command tempCommand;
    for (int i = 0; i < listOfCommands.size() ; i++) {
      if (listOfCommands.get(i).getParameter().equals(parameter)) {
        tempCommand = listOfCommands.get(i);
        return tempCommand;
      }
    }
    return null;
  }
}
