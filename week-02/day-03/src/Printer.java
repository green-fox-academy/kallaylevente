/**
 * Created by Levente on 2017. 03. 22..
 */
public class Printer {
    public static void main(String[] args) {
     String[] stringArray = {"bela", "tamas" , "jozsi"};
     printer(stringArray);
    }
    public static void  printer(String... test1) {
        for (int i = 0; i < test1.length ; i++) {
            System.out.println(test1[i] + " ");
        }

    }
}
