import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {

  public static void mainDraw(Graphics graphics){
    int x = 0;
    int y = 150;

    drawLine(x,y,graphics);

    x = 150;
    y = 300;

    drawLine(x,y,graphics);

    x = 300;
    y = 150;

    drawLine(x,y,graphics);
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.



  }

  public static void drawLine(int x, int y,Graphics graphics) {
    int centerX = 150;
    int centerY = 150;
    graphics.drawLine(x, y, centerX, centerY);

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
