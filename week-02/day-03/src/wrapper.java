/**
 * Created by Levente on 2017. 03. 22..
 */
public class wrapper {
    public static void main(String[] args) {
        String al = "Greenfox";
        greet(al);
    }
    public static void greet(String al) {
        String string = al;
        System.out.println("Greetings dear, " + string);
    }
}
