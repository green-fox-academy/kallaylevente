/**
 * Created by Levente on 2017. 04. 18..
 */
public class CharOperations implements CharSequence {
  private String s;

  public CharOperations(String s) {
    StringBuilder sb = new StringBuilder(s);
    this.s = sb.reverse().toString();

  }

  @Override
  public int length() {
    return this.s.length();
  }

  @Override
  public char charAt(int index) {
    return this.s.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return s.substring(start,end);
  }
}
