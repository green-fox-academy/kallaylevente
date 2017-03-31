import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {


  public static void mainDraw(Graphics graphics) {
   int size = 300;
   int n = 6;
   int x  = 0;
    int y = 0;
    paint(graphics,n,size,x,y);
  }

  public static void paint(Graphics graphics,int n, int size,int x, int y) {
    int sides =  3;
    int[] xPoints = {x,x+size,x+size/2};
    int[] yPoints = {y,y,y+size};
    graphics.drawPolygon(xPoints,yPoints,sides);
    if (n > 0) {
      paint(graphics,n-1,size/2,x,y);
      paint(graphics,n-1,size/2,x+size/2,y);
      paint(graphics,n-1,size/2,x+size/4,y+size/2);
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