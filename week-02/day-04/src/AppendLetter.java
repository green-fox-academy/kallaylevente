import java.util.*;

public class AppendLetter {
    public static void main(String[] args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        String temp = new String();
        int size = far.size();
        for (int i = 0; i < size ; i++) {
            temp = far.get(i);
            temp = temp.concat("a");
            far.set(i,temp);
        }


        System.out.println(far);
    }
}
