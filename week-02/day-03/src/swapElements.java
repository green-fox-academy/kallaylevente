/**
 * Created by Levente on 2017. 03. 22..
 */
public class swapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        String Temp = "";
        //System.out.println("abc 1 is: " + abc[0] + " abc2 is: " + abc[2]);
        Temp = abc[0];
       // System.out.println("Temp is now:" + Temp);
        abc[0] = abc[2];
        abc[2] = Temp;
        System.out.println("abc 1 is: " + abc[0] + " abc2 is: " + abc[2]);

    }
}
