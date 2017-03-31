import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class practice {
  final static int SIDES = 6;
  final static int SIZE = 400;
  final static int NUMBER = 4;

  public static void mainDraw(Graphics graphics) {
    double x = 300;
    double y = 150;
    double wX = 600;
    double hY = 516;
    paint(graphics, x, y, NUMBER, wX, hY);
  }

  public static void paint(Graphics graphics, double x, double y, int n, double wX, double hY) {
    double[] xPointsD = {x, x + wX / 2, x + wX / 4 * 3, x + wX / 2, x, x - wX / 4};
    double[] yPointsD = {y, y, y + hY / 2, y + hY, y + hY, y + hY / 2};
    int[] xPoint = new int[xPointsD.length];
    for (int i = 0; i < xPoint.length; ++i)
      xPoint[i] = (int) xPointsD[i];
    int[] yPoint = new int[yPointsD.length];
    for (int i = 0; i < yPoint.length; ++i)
      yPoint[i] = (int) yPointsD[i];
    graphics.drawPolygon(xPoint, yPoint, SIDES);
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