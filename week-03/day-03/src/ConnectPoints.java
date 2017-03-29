import javax.swing.*;

  import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectPoints {

  public static void mainDraw(Graphics graphics){
    int[][] input = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
      {120, 100}, {85, 130}, {50, 100}};
    connectPoints(input,graphics);

    // create a function that takes 1 parameter:
    // an array of {x, y} points
    // and connects them with green lines.
    // connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
    // connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
    // {120, 100}, {85, 130}, {50, 100}}

  }

  public static void connectPoints(int[][] numbers, Graphics graphics) {
    int startX = 0;
    int startY = 0;
    int endX = 0;
    int endY = 0;
    for (int i = 0; i < numbers.length-1; i++) {
        startX = numbers[i][0];
        startY = numbers[i][1];
        endX = numbers[i + 1][0];
        endY = numbers[i + 1][1];
        graphics.drawLine(startX, startY, endX, endY);
    }
    graphics.drawLine(endX,endY,numbers[0][0],numbers[0][1]);
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