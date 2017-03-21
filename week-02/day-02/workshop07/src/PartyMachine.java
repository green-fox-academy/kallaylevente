import java.util.Scanner;

/**
 * Created by Levente on 2017. 03. 21..
 */
public class PartyMachine {
    public static void main(String[] args) {
        System.out.println("This programm will decide if this party gonna be awsome");
        System.out.println("All i need is to give me the number of girls and boys attended");
        System.out.println("Pleas type in the number of girls");
        Scanner scanner = new Scanner(System.in);
        int girls = scanner.nextInt();
        System.out.println("Now please give me the number of boys");
        Scanner scanner2 = new Scanner(System.in);
        int boys = scanner2.nextInt();
        double ratio = ((double)girls / boys);
        if (((girls + boys ) > 20) && (ratio == 1) ){
            System.out.println("The party is exelent!");
        }
        else if (((girls + boys) > 20) && (ratio != 1)) {
            System.out.println("Quite cool party!");
        }
        else if ( ( (girls + boys) < 20) && ( girls > 0) ) {
            System.out.println("Average party...");
        }
        else if (girls == 0) {
            System.out.println("Sausage party");
        }


    }
}
