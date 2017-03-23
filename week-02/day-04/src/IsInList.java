import java.util.*;

public class IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        int[] search = {4, 8, 13, 16};
        int length = search.length;
        int indicator = 0;
        for (int i = 0; i < length-1 ; i++) {
            if (list.contains(search[i])) {
                indicator ++ ;
            }
            else {
                indicator --;
            }

        }
        if (indicator == (length-1)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }
}