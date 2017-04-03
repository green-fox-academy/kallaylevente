import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    System.out.println(sneakIt(dominoes));
  }

  public static List<Domino> sneakIt(List<Domino> input) {
    for (int i = 0; i < input.size() - 1; i++) {
      int[] valueA = input.get(i).getValues();
      for (int j = i + 1; j < input.size(); j++) {
        int[] valueB = input.get(j).getValues();
        if (valueA[1] == valueB[0]) {
          Collections.swap(input, i + 1, j);

        }
      }
    }
    return input;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}