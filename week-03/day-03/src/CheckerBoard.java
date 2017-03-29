import javax.swing.*;

  import java.awt.*;

  import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {

  public static void mainDraw(Graphics graphics){
    int size = 15;
    int x = 0;
    int y = 0;
    for (int j = 0; j < 10 ; j++) {
      x = 0;
      for (int i = 0; i < 10; i++) {
        graphics.setColor(Color.black);
        graphics.fillRect(x, y, size, size);
        x = x + 30;
      }
      y = y + 30;
    }
    y = 15;
    for (int j = 0; j < 10 ; j++) {
      x = 15;
      for (int i = 0; i < 10; i++) {
        graphics.setColor(Color.black);
        graphics.fillRect(x, y, size, size);
        x = x + 30;
      }
      y = y + 30;
    }


    // fill the canvas with a checkerboard pattern.



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
