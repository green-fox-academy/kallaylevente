import java.util.ArrayList;

public class CowsAndBulls {

  public static void main(String[] args) {

    int num = 1000 + (int) (Math.random() * 900);
    System.out.println(num);
    ArrayList<Integer> numList = new ArrayList<>();

    for (int i = 0; i < 4; i++) {
      numList.add(num % 10);
      num = num / 10;
    }



    }


}
