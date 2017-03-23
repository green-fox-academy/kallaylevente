import java.util.*;

public class StudentCounter{
    public static void main(String... args){
        ArrayList<Map<String, Object>> map = new ArrayList<Map<String, Object>>();

        // Given this list of hashmaps...

        Map<String, Object> row0 = new HashMap<String, Object>();
        row0.put("name", "Rezso");
        row0.put("age", 9.5);
        row0.put("candies", 2);
        map.add( row0 );

        Map<String, Object> row1 = new HashMap<String, Object>();
        row1.put("name", "Gerzson");
        row1.put("age", 10);
        row1.put("candies", 1);
        map.add( row1 );

        Map<String, Object> row2 = new HashMap<String, Object>();
        row2.put("name", "Aurel");
        row2.put("age", 7);
        row2.put("candies", 3);
        map.add( row2 );

        Map<String, Object> row3 = new HashMap<String, Object>();
        row3.put("name", "Zsombor");
        row3.put("age", 12);
        row3.put("candies", 5);
        map.add( row3 );

        Map<String, Object> row4 = new HashMap<String, Object>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        map.add( row4 );

        Map<String, Object> row5 = new HashMap<String, Object>();
        row5.put("name", "Teodor");
        row5.put("age", 3);
        row5.put("candies", 2);
        map.add( row5 );


        String candie = new String();
        int candy = 0;
        String rowname = new String();

        for (int i = 0; i < map.size() ; i++) {
            candy = Integer.parseInt(map.get(i).get("candies").toString());
            if (candy > 4) {
                System.out.println(map.get(i).get("name").toString());
            }

        }
        String age = new String();
        double age1 = 0;
        double agesum = 0;
        for (int i = 0; i < map.size() ; i++) {
            candy = Integer.parseInt(map.get(i).get("candies").toString());
            if (candy < 5) {
                age = map.get(i).get("age").toString();
                age1 = Double.parseDouble(age);
                agesum = agesum + age1;
            }

        }
        System.out.println("tha sum value of: " +agesum);



    }
}
