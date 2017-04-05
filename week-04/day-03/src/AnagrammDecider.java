import java.util.Arrays;
import java.util.Collections;

public class AnagrammDecider {
  private String word1 = "abcd";
  private String word2 = "acdb";

  public AnagrammDecider() {
    this.word1 = "abcd";
    this.word2 = "acdb";
  }

  public static boolean ifEqual(String word1, String word2) {
    char[] ar = word1.toCharArray();
    Arrays.sort(ar);
    word1 = String.valueOf(ar);
    ar = word2.toCharArray();
    Arrays.sort(ar);
    word2 = String.valueOf(ar);

    if (word1.equalsIgnoreCase(word2)) {
      return true;
    } else {
      return false;
    }
  }
}
