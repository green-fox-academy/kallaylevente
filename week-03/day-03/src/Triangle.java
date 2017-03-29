import javax.swing.*;

  import java.awt.*;

  import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {

  public static void mainDraw(Graphics graphics){
    int aX = 0;
    int bX = 0;
    int cX = 0;
    int aY = 0;
    int bcY = 0;

    bcY= 300;
    aY = 290;
    aX = 6;
    bX = 12;
    cX = 0;
    int[] xPoints = {aX ,bX ,cX};
    int[] yPoints = {aY ,bcY ,bcY};
    for (int j = 0; j < 18; j++) {
      bcY= 300 - (j * 10);
      aY = 290 - (j * 10);
      aX = 6 + (j * 6);
      bX = 12 + (j * 6);
      cX = 0 + (j * 6);
      xPoints[0] = aX;
      xPoints[1] = bX;
      xPoints[2] = cX;
      yPoints[0] = aY;
      yPoints[1] = bcY;
      yPoints[2] = bcY;
      for (int i = j; i < 17; i++) {
        graphics.drawPolygon(xPoints, yPoints, 3);
        aX = aX + 12;
        bX = bX + 12;
        cX = cX + 12;
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