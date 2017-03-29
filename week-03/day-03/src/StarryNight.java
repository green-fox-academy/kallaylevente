import javax.swing.*;

  import java.awt.*;

  import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {

  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.black);
    graphics.fillRect(0, 0, 300, 300);
    int stars = 2;

    for (int i = 0; i < 50; i++) {
      int x = (int) (Math.random() * 300);
      int y = (int) (Math.random() * 300);
      int C = (int) (Math.random() * 255);
      Color color = new Color(C,C,C);
      graphics.setColor(color);
      graphics.fillRect(x ,y ,stars ,stars);
    }

    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)



  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}
