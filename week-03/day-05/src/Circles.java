import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {


  public static void mainDraw(Graphics graphics) {
    graphics.drawRect(0,0,600,600);
  int multiply = 4;
  int r = 300;
  int x = 150;
  int y = 0;
  paint(graphics,multiply,x,y,r);

  }
  public static void paint(Graphics graphics,int n,int x,int y, int r) {
    graphics.drawOval(x,y,r,r);
    if (n > 0) {
      paint(graphics,n-1,x+r/4,y,r/2);
      paint(graphics,n-1,x,(y+100)+r/3,r/2);

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