/**
 * Created by Levente on 2017. 03. 21..
 */
public class VariableMutation2 {
    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        if  ( (a % 2) == 0 ) {
            out ++ ;
        }
        System.out.println("out is: " + out);
        int b = 30;
        String out2 = "";
        if ( (b > 10) && (b < 20) ){
            out2 = "Sweet!";
        }
        else if (b <  10) {
            out2 = "More!";
        }
        else if (b > 20) {
            out2 = "Less";
        }
        System.out.println(out2);

        int c = 123;
        int credits = 10;
        boolean isBonus = true;
        if ( (credits >= 50) && (isBonus == false)) {
            c = (c-2) ;
        }
        else if ((credits < 50) && (isBonus == false)) {
            c = (c-1);
        }
        else if (isBonus == true) {
            c = c;
        }
        System.out.println(c);

        int d = 7;
        int time = 120;
        String out3 = "";
        if (((d % 4) == 0) && (time < 200)) {
            out3 = "check";
        }
        else if (time > 200) {
            out3 = "Time out";
        }
        else {
            out3 = "Run Forest Run!";
        }
        System.out.println(out3);

    }
}
