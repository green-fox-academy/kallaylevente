import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lotoo {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();
        try {
            Path path = Paths.get("otos.txt");      //// list of strings with every lines
            lines = Files.readAllLines(path);
        }
        catch (Exception e){
            System.out.println("Uh-oh, an error happend: " + e.getClass());
        }
        ArrayList<String> alistOfFiveNumber = new ArrayList<String>();
        String[] test = new String[16];
        //every splitted string into a strin[]

        for (int i = 0; i < lines.size() ; i++) {
            test = lines.get(i).split(";");
            for (int j = 11; j < test.length ; j++) {       // 5 numbers of every week is in the alist
                alistOfFiveNumber.add(test[j]);
            }
        }

        Map<String, Integer> frequency = new HashMap<String, Integer>();

        for(String word: alistOfFiveNumber) {
            Integer count = frequency.get(word);
            frequency.put(word, (count==null) ? 1 : count+1);
        }
        int[] finish = new int[5];
        Integer min = 0;
        Integer max = 0;
        String jee = new String();
        String minkey = new String();
        String minvalue = new String();
        String maxvalue = new String();
        String maxkey = new String();
        for (int i = 0; i < 5; i++) {
            max = 0;
            for (int j = 1; j < 91; j++) {
                jee = Integer.toString(j);

                min = frequency.get(jee);
                if (min > max){
                    max = min;
                    maxkey = jee;
                }
            }
            finish[i] = max;
            frequency.remove(maxkey);
        }

        for (int i = 0; i < 5 ; i++) {
            System.out.println(finish[i]);
        }
    }

}



