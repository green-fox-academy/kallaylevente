/**
 * Created by Levente on 2017. 03. 21..
 */
public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int remainingHours = 24 - currentHours;
        int remainingMinutes = 60 - currentMinutes;
        int remainingSeconds = 60 - currentSeconds;
        int daySeconds = 24 * 60 * 60;
        int remaining = ((remainingHours * 3600) + (remainingMinutes * 60) + (remainingSeconds));
        System.out.println("There are " + remaining + " seconds remains of this day");

    }
}
