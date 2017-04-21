public class ListItems extends Command {

  public ListItems() {
    this.parameter = "-l";
  }

  @Override
  void execute() {
    System.out.println("Python Todo application\n"
        + "=======================\n"
        + "\n"
        + "Command line arguments:\n"
        + " -l   Lists all the tasks\n"
        + " -a   Adds a new task\n"
        + " -r   Removes an task\n"
        + " -c   Completes an task");
  }
}
