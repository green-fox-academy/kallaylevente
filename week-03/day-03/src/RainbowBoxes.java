import javax.swing.*;

  import java.awt.*;

  import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxes {

  public static void mainDraw(Graphics graphics){
    int size = 300;
    for (int i = 0; i < 15 ; i++) {
      size = size -20;
      int R = (int) (Math.random() * 256);
      int G = (int) (Math.random() * 256);
      int B = (int) (Math.random() * 256);
      Color randomColor = new Color(R, G, B);
      centerBox(size, randomColor, graphics);
    }


    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
  }

  public static void  centerBox(int size,Color randomColor, Graphics graphics) {
    int x = 150 - (size/2);
    int y = 150 - (size/2);
    graphics.setColor(randomColor);
    graphics.fillRect(x, y, size,size);
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