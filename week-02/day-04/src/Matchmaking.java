import java.util.*;

public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff"));
        ArrayList<String> order = new ArrayList<String>();
        String girl = new String();
        String boy = new String();

        for (int i = 0; i < girls.size() ; i++) {
            girl = girls.get(i);
            boy = boys.get(i);
            order.add(girl);
            order.add(boy);
        }
        System.out.println(order);
    }


}
