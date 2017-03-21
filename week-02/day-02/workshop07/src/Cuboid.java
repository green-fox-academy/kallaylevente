/**
 * Created by Levente on 2017. 03. 21..
 */
public class Cuboid {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        System.out.println("The surface of the cuboid is:" + (2 *((a * b) + (b * c) + (a * c) ) ));
        System.out.println("The volume of the cuboid is: " + (a*b*c));
    }
}
