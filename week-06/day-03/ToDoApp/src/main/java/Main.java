import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class Main {

  public static void main(String[] args) {
    CommandList todoApp = new CommandList(args);
    OptionParser parser = new OptionParser();
    parser.accepts("l");
    parser.accepts("a").withRequiredArg();
    parser.accepts("r").withRequiredArg();
    parser.accepts("c").withRequiredArg();

    try {
      OptionSet options = parser.parse(args);
      if (options.has("a")) {
        System.out.println("`a` was given with the argument " + options.valueOf("a"));
        todoApp.getCommand("-a").execute();
      }

      if (options.has("l")) {
        System.out.println("`l` was given with the no additional information.");
        todoApp.getCommand("-l").execute();
      }

      if (options.has("r")) {
        System.out.println("`r` was given with the argument " + options.valueOf("r"));
        todoApp.getCommand("-r");
        todoApp.getCommand("-r").execute();
      }

      if (options.has("c")) {
        System.out.println("`c` was given with the argument " + options.valueOf("c"));
        todoApp.getCommand("-c");
        todoApp.getCommand("-c").execute();
      }
    } catch (joptsimple.OptionException e){
      System.out.println("No arguments given.");
    }

  }

}
