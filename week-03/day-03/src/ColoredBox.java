import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics){
    graphics.setColor(Color.red);
    graphics.drawLine(20,20,120,20);

    graphics.setColor(Color.green);
    graphics.drawLine(120,20,120,120);

    graphics.setColor(Color.blue);
    graphics.drawLine(120,120,20,120);

    graphics.setColor(Color.pink);
    graphics.drawLine(20,120,20,20);
    // draw a box that has different colored lines on each edge.



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
