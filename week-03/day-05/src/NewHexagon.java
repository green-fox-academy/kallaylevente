import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class NewHexagon {
  final static int SIDES = 6;
  final static int SIZE = 400;
  final static int NUMBER = 3;

  public static void mainDraw(Graphics graphics) {
    int x = 300;
    int y = 150;
    int wX = 600;
    int hY = 516;
    paint(graphics, x, y, NUMBER, wX, hY);
  }

  public static void paint(Graphics graphics, int x, int y, int n, int wX, int hY) {
    int[] xPoints = {x, x + wX / 2, x + wX / 4 * 3, x + wX / 2, x, x - wX / 4};
    int[] yPoints = {y, y, y + hY / 2, y + hY, y + hY, y + hY / 2};
    graphics.drawPolygon(xPoints, yPoints, SIDES);
    if (n > 0) {
      paint(graphics, x, y, n - 1, wX / 3, hY / 3);
      paint(graphics, x + wX / 100 * 33, y, n - 1, wX / 3, hY / 3);
      paint(graphics, x + wX / 2, y + hY / 3, n - 1, wX / 3, hY / 3);
      paint(graphics, x + wX / 100 * 33, y + hY / 3 * 2, n - 1, wX / 3, hY / 3);
      paint(graphics, x, y + hY / 3 * 2, n - 1, wX / 3, hY / 3);
      paint(graphics, x - wX / 200 * 33, y + hY / 3, n - 1, wX / 3, hY / 3);
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