import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by aze on 2017.04.04..
 */
public class Extension {

  int add(int a, int b) {
    return (a + b);
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b) {
      if (a > c) {
        return a;
      } else return c;
    } else if (b > c) {
      return b;
    } else
      return c;

  }

  double median(List<Integer> pool) {
    double median = 0;
    Collections.sort(pool);
    if ((pool.size() % 2) != 0){
      median = pool.get((pool.size() - 1) / 2);
    } else {
      median = ((double) (pool.get(pool.size() / 2 - 1)) + (double) (pool.get((pool.size() / 2)))) / 2;
    }
    return median;
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    String lastLetter = hungarian.substring(hungarian.length() - 1);
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split("" + c));
        i += 2;
        length = teve.length();
      }
      if (isVowel(lastLetter.charAt(0))) {
        teve += lastLetter + "v" + lastLetter;
      }

      return teve;
    }
    return teve;
  }
}