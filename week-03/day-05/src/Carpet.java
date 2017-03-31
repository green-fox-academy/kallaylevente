import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carpet {


  public static void mainDraw(Graphics graphics) {
    int x = 200;
    int y = 200;
    int width = 200;
    int n = 5;
    paint(graphics, n, x, y, width);
  }

  public static void paint(Graphics graphics, int n, int x, int y, int w) {
    graphics.fillRect(x, y, w, w);
    if (n > 0) {
      int R = (int) (Math.random() * 256);
      int G = (int) (Math.random() * 256);
      int B = (int) (Math.random() * 256);
      Color randomColor = new Color(R, G, B);
      graphics.setColor(randomColor);
      paint(graphics, n - 1, x - (w / 3 * 2), y - (w / 3 * 2), w / 3);
      paint(graphics, n - 1, x - (w / 3 * 2), y + (w / 3), w / 3);
      paint(graphics, n - 1, x - (w / 3 * 2), y + ((w / 3) * 4), w / 3);
      paint(graphics, n - 1, x + w / 3, y + ((w / 3) * 4), w / 3);
      paint(graphics, n - 1, x + ((w / 3) * 4), y + ((w / 3) * 4), w / 3);
      paint(graphics, n - 1, x + ((w / 3) * 4), y + w / 3, w / 3);
      paint(graphics, n - 1, x + ((w / 3) * 4), y - (w / 3 * 2), w / 3);
      paint(graphics, n - 1, x + w / 3, y - (w / 3 * 2), w / 3);

    }
  }


  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(600, 600));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);

  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);


    }
  }

}
