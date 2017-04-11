import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  int testBoxX;
  int testBoxY;
  String heroImage;
  int currentLocationX = testBoxX;
  int currentLocationY = testBoxY;
  int heroX =0 ;
  int heroY = 0;
  TableArray tableArray = new TableArray();

  public Board() {
    heroImage = "hero-down.png";
    testBoxX = 0;
    testBoxY = 0;
    setPreferredSize(new Dimension(1000, 1000));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    floorPaint(graphics);

    PositionedImage wallImage = new PositionedImage("wall.png", 0, 0);
    for (int i = 0; i < tableArray.getWallPosition().length; i++) {
      for (int j = 0; j < tableArray.getWallPosition()[i].length; j++) {
        if (tableArray.getWallPosition()[i][j] == 1) {
          wallImage.posY = (i * 72);
          wallImage.posX = (j * 72);
          wallImage.draw(graphics);
          if (testBoxX == wallImage.posX && testBoxY == wallImage.posY) {
            testBoxY = currentLocationY;
            testBoxX = currentLocationX;
          }
        }
        if (tableArray.getWallPosition()[i][j] == 2) {
          int skeletonY = (i * 72);
          int skeletonX = (j * 72);
          PositionedImage skeleton = new PositionedImage("skeleton.png",skeletonX,skeletonY);
          skeleton.draw(graphics);
        }
        if (tableArray.getWallPosition()[i][j] == 3) {
          int skeletonY = (i * 72);
          int skeletonX = (j * 72);
          PositionedImage boss = new PositionedImage("boss.png",skeletonX,skeletonY);
          boss.draw(graphics);
        }
      }
    }

    if (testBoxX < 0) {
      testBoxX = testBoxX + 72;
    } else if (testBoxY < 0) {
      testBoxY = testBoxY + 72;
    } else if (testBoxX > 719) {
      testBoxX = testBoxX - 72;
    } else if (testBoxY > 719) {
      testBoxY = testBoxY - 72;
    }

    PositionedImage hero = new PositionedImage(heroImage, testBoxX, testBoxY);
    hero.draw(graphics);
    currentLocationX = testBoxX;
    currentLocationY = testBoxY;
    heroX = currentLocationX/72;
    heroY = currentLocationY/72;


   //String hud = ;
   //graphics.drawString(hud,720,320);

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

  public void floorPaint(Graphics graphics){
  PositionedImage floor = new PositionedImage("floor.png", 0, 0);
    for (int i = 0; i < 10; i++) {
      floor.draw(graphics);
      for (int j = 0; j < 9; j++) {
        floor.posY = floor.posY + 72;
        floor.draw(graphics);
      }
      floor.posX = floor.posX + 72;
      floor.posY = 0;
    }
  }
}