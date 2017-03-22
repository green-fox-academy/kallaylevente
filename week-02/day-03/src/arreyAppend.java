/**
 * Created by Levente on 2017. 03. 22..
 */
public class arreyAppend {
    public static void main(String[] args) {
        String[] nimals = {"kuty", "macs", "cic"};
        for (int i = 0; i < nimals.length; i++) {
            nimals[i] = (nimals[i] + "a");
            System.out.println(nimals[i]);
        }
    }
}
