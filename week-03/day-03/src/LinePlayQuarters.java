import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics) {
    graphics.drawLine(0, 150, 300, 150);
    graphics.drawLine(150, 0, 150, 300);

    Color color = new Color(177, 70, 244);

    for (int k = 0; k < 2; k++){
      int startX = 0;
      int startY = 0 + (k * 150);
      int endX = 150;
      int endY = 10 + (k * 150);
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 15; j++) {
          graphics.setColor(color);
          graphics.drawLine(startX, startY, endX, endY);
          startX = startX + 10;
          endY = endY + 10;

        }
        startX = 150;
        startY = 0 + (k * 150);
        endX = 300;
        endY = 10+ (k * 150);
      }
  }
    color = Color.green;
    graphics.setColor(color);
    for (int k = 0; k < 2; k++) {
      int startX = 0;
      int startY = 0 + (k * 150);
      int endX = 10;
      int endY = 150 + (k * 150);
      for (int j = 0; j < 2; j++) {
        for (int i = 0; i < 15; i++) {
          graphics.drawLine(startX, startY, endX, endY);
          startY = startY + 10;
          endX = endX + 10;
        }
        startX = 150;
        startY = 0 + (k * 150);
        endX = 150;
        endY = 150 + (k * 150);
      }
    }


    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]


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