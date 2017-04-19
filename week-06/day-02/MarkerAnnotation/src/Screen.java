import java.lang.annotation.*;


@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  Monitor {
  String aspectratio() default "4:3";
}

@Monitor
public class Screen {
  private int height;
  private int width;

  public Screen(int height, int width) {
    this.height = height;
    this.width = width;
  }
}
