import com.sun.prism.shader.AlphaOne_LinearGradient_AlphaTest_Loader;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();
        try {
            Path path = Paths.get("duplicated-chars.txt");
            lines = Files.readAllLines(path);
        }
        catch (Exception e){
            System.out.println("Uh-oh, an error happend: " + e.getClass());
        }
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < lines.size() ; i++) {
            list.add(lines.get(i));
        }
        String temp = new String();

        for (int i = 0; i < list.size() ; i++) {
                char[] charArray = list.get(i).toCharArray();
                temp ="";
                for (int k = 0; k < charArray.length; k = k+2) {
                    temp = temp + charArray[k];
                }

            list.set(i,temp);
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
