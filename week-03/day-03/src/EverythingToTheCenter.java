import javax.swing.*;

  import java.awt.*;

  import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EverythingToTheCenter {

  public static void mainDraw(Graphics graphics){
    int startX = 0;
    int startY = 0;
    for (int i = 0; i < 15 ; i++) {
      drawer(startX, startY, graphics);
      startX = startX + 20;
    }

    startX = 300;
    for (int i = 0; i < 15 ; i++) {
      drawer(startX, startY, graphics);
      startY = startY + 20;
    }

    startY = 300;
    for (int i = 0; i < 15 ; i++) {
      drawer(startX, startY, graphics);
      startX = startX - 20;
    }

    startX = 0;

    for (int i = 0; i < 15 ; i++) {
      drawer(startX, startY, graphics);
      startY = startY - 20;
    }

    // / create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // fill the canvas with lines from the edges, every 20 px, to the center.



  }
  public static void  drawer(int x, int y, Graphics graphics){
    graphics.drawLine(x, y, 150,150);

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
