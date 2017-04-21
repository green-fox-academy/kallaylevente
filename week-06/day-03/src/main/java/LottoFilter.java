import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class LottoFilter {

  public static void main(String[] args) {
    OptionParser parser = new OptionParser();
    parser.accepts("y").withRequiredArg();
    parser.accepts("o").withRequiredArg();
    parser.accepts("f").withRequiredArg();
    OptionSet options = parser.parse(args);

    if (options.has("f")) {
      System.out.println("`-f` was given with the argument " + options.valueOf("f"));
    }

    if (options.has("y")) {
      System.out.println("`-y` was given with the argument " + options.valueOf("y"));
    }
    if (options.has("o")) {
      System.out.println("`-o` was given with the argument " + options.valueOf("o"));
    }
  }


}
