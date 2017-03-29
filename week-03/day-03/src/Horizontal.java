import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {

  public static void mainDraw(Graphics graphics) {
    int x = (int) (Math.random() * 300);
    int y = (int) (Math.random() * 300);

    drawLine(x, y, graphics);

    x = (int) (Math.random() * 300);
    y = (int) (Math.random() * 300);
    drawLine(x, y, graphics);

    x = (int) (Math.random() * 300);
    y = (int) (Math.random() * 300);
    drawLine(x, y, graphics);

    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a 50 long horizontal line from that point.
    // draw 3 lines with that function.


  }

  public static void drawLine(int x, int y, Graphics graphics) {
    int endX = 0;
    if (x < 250) {
      endX = x + 50;
    } else {
      endX = x - 50;
    }
    graphics.drawLine(x, y, endX, y);
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

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}