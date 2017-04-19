import java.lang.annotation.Annotation;

/**
 * Created by Levente on 2017. 04. 19..
 */
public class Main {
  public static void main(String[] args) {
    Screen169 obj = new Screen169(9,16);
    Class c = obj.getClass();
    Annotation an = c.getAnnotation(Monitor.class);
     Monitor m = (Monitor)an;
    System.out.println(m.aspectratio());
  }
}
