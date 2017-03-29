import sun.font.FontRunIterator;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopStar {

  public static void mainDraw(Graphics graphics) {
    int startX = 150;
    int startY = 0;
    int endX = 150;
    int end_X = 150;
    int endY = 150;
    int end_Y = 150;
    graphics.setColor(Color.green);

      for (int i = 0; i < 15; i++) {
        graphics.drawLine(startX, startY, endX, endY);
        graphics.drawLine(startX,startY,end_X,end_Y);
        endX = endX + 10;
        startY = startY + 10;
        end_X = end_X - 10;
      }
    startY = 150;
    startX = 150;
    endX = 300;
    end_X = 0;
    for (int i = 0; i < 16; i++) {
      graphics.drawLine(startX, startY, endX, endY);
      graphics.drawLine(startX,startY,end_X,end_Y);
      endX = endX - 10;
      startY = startY + 10;
      end_X= end_X + 10;

    }

    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/envelope-star/r2.png]


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
