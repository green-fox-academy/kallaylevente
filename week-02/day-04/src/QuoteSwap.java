import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        String temp1 = list.get(5);
        String temp2 = list.get(2);
        list.set(2, temp1);
        list.set(5, temp2);
        for (int i = 0; i < list.size() ; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}