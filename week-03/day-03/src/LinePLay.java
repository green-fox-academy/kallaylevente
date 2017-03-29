import javax.swing.*;

  import java.awt.*;

  import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePLay {

  public static void mainDraw(Graphics graphics){
    Color color = new Color(177,70,244  );
    int startX = 0;
    int startY = 0;
    int endX = 300;
    int endY = 20;
    for (int i = 0; i < 15; i++) {
      graphics.setColor(color);
      graphics.drawLine(startX,startY,endX,endY);
      startX = startX + 20;
      endY = endY + 20;
    }

    color = Color.green;
    startX = 0;
    startY = 0;
    endY = 300;
    endX = 20;
    for (int i = 0; i < 15; i++) {
      graphics.setColor(color);
      graphics.drawLine(startX,startY,endX,endY);
      startY = startY + 20;
      endX = endX + 20;
    }
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/exercises/drawing/line-play/r1.png]



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
