/**
 * Created by Levente on 2017. 03. 21..
 */
public class CodingHours {
    public static void main(String[] args) {
      int hours = 6;
      int semester = 17;
      int weekly = 52;
      int learningTime = semester * 5 * hours;
      int whole = semester * 52;
      int intPercent = 0;
      double percentage = ((double)learningTime / whole) * 100;
        System.out.println("An attendee codes " + learningTime + " hours in a semester");
        System.out.println("So they are coding the " +  percentage + "% of the whole semester");
    }
}
