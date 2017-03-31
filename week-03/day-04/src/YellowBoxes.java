import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class YellowBoxes {

  public static void mainDraw(Graphics graphics) {
    int n = 5;
    int x = 0;
    int y = 0;
    int size = 486;
    paint(graphics, n,x,y,size);
  }

  public static void paint(Graphics graphics, int n,int x, int y,int w) {
    graphics.drawRect(x,y,w,w);
    if (n > 0)  {
      paint(graphics,n-1,x+(w/3), y,(w/3) );
      paint(graphics,n-1,x, y+w/3,(w/3) );
      paint(graphics,n-1,x+(w/3), y+w/3*2,(w/3) );
      paint(graphics,n-1,x+(w/3*2), y+w/3,(w/3) );

    }
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
      this.setBackground(Color.yellow);
      mainDraw(graphics);


    }
  }

}
