import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {



  public static void mainDraw(Graphics graphics){

    for (int i = 0; i < 4 ; i++) {
      int x = (int) (Math.random() * 300);
      int y = (int) (Math.random() * 300);
      int w = (int) (Math.random() * 100);
      int h = (int) (Math.random() * 100);
      int R = (int) (Math.random() * 256);
      int G = (int) (Math.random() * 256);
      int B = (int) (Math.random() * 256);
      Color randomColor = new Color(R, G, B);
      graphics.setColor(randomColor);
      graphics.fillRect(x, y, w, h);
    }


    // draw four different size and color rectangles.



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
