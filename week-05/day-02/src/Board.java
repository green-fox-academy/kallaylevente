import javafx.scene.control.Tab;

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
  int heroX = 0;
  int heroY = 0;
  TableArray tableArray = new TableArray();
  PositionedImage wallImage = new PositionedImage("wall.png", 0, 0);

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

    for (int i = 0; i < tableArray.getMap().length; i++) {
      for (int j = 0; j < tableArray.getMap()[i].length; j++) {
        if (tableArray.getMap()[i][j] == 1) {
          wallImage.posY = (i * 72);
          wallImage.posX = (j * 72);
          wallImage.draw(graphics);
          if (testBoxX == wallImage.posX && testBoxY == wallImage.posY) {
            testBoxY = currentLocationY;
            testBoxX = currentLocationX;
          }
        }
        if (tableArray.getMap()[i][j] == 2) {
          int skeletonY = (i * 72);
          int skeletonX = (j * 72);
          PositionedImage skeleton = new PositionedImage("skeleton.png", skeletonX, skeletonY);
          skeleton.draw(graphics);
        }
        if (tableArray.getMap()[i][j] == 3) {
          int skeletonY = (i * 72);
          int skeletonX = (j * 72);
          PositionedImage boss = new PositionedImage("boss.png", skeletonX, skeletonY);
          boss.draw(graphics);
        }
      }
    }


    PositionedImage hero = new PositionedImage(heroImage, testBoxX, testBoxY);
    hero.draw(graphics);
    currentLocationX = testBoxX;
    currentLocationY = testBoxY;
    heroX = currentLocationX / 72;
    heroY = currentLocationY / 72;

    graphics.drawString(tableArray.hud(),720,360);



  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {

    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (heroY == 0) {
        testBoxY = currentLocationY;
        heroImage = "hero-up.png";
      } else if (tableArray.getMap()[heroY - 1][heroX] == 2) {
        testBoxY -= 72;
        heroImage = "hero-up.png";
        tableArray.fight(heroY - 1,heroX);
      } else
        testBoxY -= 72;
      heroImage = "hero-up.png";
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (heroY == 9) {
        testBoxY = currentLocationY;
        heroImage = "hero-down.png";
      } else if (tableArray.getMap()[heroY + 1][heroX] == 2) {
        testBoxY += 72;
        heroImage = "hero-down.png";
        tableArray.fight(heroY + 1,heroX);
      } else {
        testBoxY += 72;
        heroImage = "hero-down.png";
      }
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (heroX == 9) {
        testBoxX = currentLocationX;
        heroImage = "hero-right.png";
      } else if (tableArray.getMap()[heroY][heroX + 1] == 2) {
        testBoxX += 72;
        heroImage = "hero-right.png";
        tableArray.fight(heroY,heroX + 1);
      } else {
        testBoxX += 72;
        heroImage = "hero-right.png";
      }
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (heroX == 0) {
        testBoxX = currentLocationX;
        heroImage = "hero-left.png";
      } else if (tableArray.getMap()[heroY][heroX - 1] == 2) {
        testBoxX -= 72;
        heroImage = "hero-left.png";
        tableArray.fight(heroY,heroX - 1);
      } else {
        heroImage = "hero-left.png";
        testBoxX -= 72;
      }
    }
    // and redraw to have a new picture with the new coordinates
    repaint();
  }

  public void floorPaint(Graphics graphics) {
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