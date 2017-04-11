import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  String heroImage;


  public Board() {
    heroImage = "hero-down.png";
    testBoxX = 0;
    testBoxY = 0;
    setBackground(Color.red);
    // set the size of your draw board
    setPreferredSize(new Dimension(1000, 1000));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    // you can create and draw an image using the class below e.g.
    PositionedImage image = new PositionedImage("floor.png", 0, 0);

    for (int i = 0; i < 10; i++) {
      image.draw(graphics);
      for (int j = 0; j < 10; j++) {
        image.posY = image.posY + 72;
        image.draw(graphics);
      }
      image.posX = image.posX + 72;
      image.posY = 0;
    }

    int[][] wallPosition = new int[][]{{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
      {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
      {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
      {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
      {0, 1, 0, 1, 0, 0, 0, 0, 1, 0,},
      {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
      {0, 0, 0, 0, 0, 1, 1, 0, 1, 0,},
      {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
      {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
      {0, 1, 0, 1, 0, 1, 0, 0, 0, 0},
    };
    // here you have a 720x720 canvas
    PositionedImage wallImage = new PositionedImage("wall.png", 0, 0);

    for (int i = 0; i < wallPosition.length; i++) {
      for (int j = 0; j < wallPosition[i].length; j++) {
        if (wallPosition[i][j] == 1) {
          wallImage.posY = (i * 72);
          wallImage.posX = (j * 72);
          wallImage.draw(graphics);
        }
      }
    }


    if (testBoxX < 0) {
      testBoxX = testBoxX + 72;
    } else if (testBoxY < 0 ) {
      testBoxY = testBoxY +72;
    } else if (testBoxX > 719) {
      testBoxX = testBoxX - 72;
    } else if (testBoxY > 719) {
      testBoxY = testBoxY - 72;
    }
    PositionedImage hero = new PositionedImage(heroImage, testBoxX, testBoxY);
    hero.draw(graphics);



  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  // But actually we can use just this one for our goals here
  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= 72;
      heroImage = "hero-up.png";
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += 72;
      heroImage = "hero-down.png";
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += 72;
      heroImage = "hero-right.png";
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      heroImage = "hero-left.png";
      testBoxX -= 72;
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }
}