/**
 * Created by Levente on 2017. 03. 21..
 */
public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        System.out.println("Your Bmi index is: " + (massInKg / (heightInM * heightInM)));
    }
}
