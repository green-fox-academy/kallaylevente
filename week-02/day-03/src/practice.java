/**
 * Created by Levente on 2017. 03. 22..
 */
public class practice {
    public static void main(String[] args) {
        String[] stringArray = {"bela", "tamas" , "jozsi"};
        printer(stringArray);
    }
    public static void  printer(String... test1) {
        for (String s: test1) {
            System.out.println(s + " ");
        }

    }
}
