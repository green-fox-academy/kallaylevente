import java.lang.annotation.*;


@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  Monitor {
  String aspectratio() default "4:3";
  String classification() default "TFT";
}

@Monitor
public class Screen {
  private int height;
  private int width;
  private enum Size {INCH15, INCH17, INCH19, INCH21, INCH23, INCH25, INCH29, INCH34}

  public Screen(int height, int width) {
    this.height = height;
    this.width = width;
  }
}
