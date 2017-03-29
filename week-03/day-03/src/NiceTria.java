import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class NiceTria {

  public static void mainDraw(Graphics graphics){
    int aX = 0;
    int bX = 0;
    int cX = 0;
    int aY = 0;
    int bcY = 0;

    bcY= 300;
    aY = 280;
    aX = 12;
    bX = 24;
    cX = 0;
    int[] xPoints = {aX ,bX ,cX};
    int[] yPoints = {aY ,bcY ,bcY};
    for (int j = 0; j < 16; j++) {
      bcY= 300 - (j * 20);
      aY = 280 - (j * 20);
      aX = 12 + (j * 12);
      bX = 24 + (j * 12);
      cX = 0 + (j * 12);
      xPoints[0] = aX;
      xPoints[1] = bX;
      xPoints[2] = cX;
      yPoints[0] = aY;
      yPoints[1] = bcY;
      yPoints[2] = bcY;
      for (int i = j; i < 15; i++) {
        graphics.drawPolygon(xPoints, yPoints, 3);
        aX = aX + 24;
        bX = bX + 24;
        cX = cX + 24;
        xPoints[0] = aX;
        xPoints[1] = bX;
        xPoints[2] = cX;
      }
    }



    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/triangles/r5.png]



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