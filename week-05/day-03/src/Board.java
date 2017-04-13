import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.util.List;

public class Board extends JComponent implements KeyListener {

  int testBoxX;
  int testBoxY;
  Map map;
  List<GameObject> aList = new ArrayList<>();
  Hero myHero;
  Skeleton mySkeleton;
  int skeletonMoveCounter;
  List<GameObject> monsterList = new ArrayList<>();
  int d4;
  int forCounter;
  int u,d,l,r;



  public Board() {

    testBoxX = 300;
    testBoxY = 300;
    map = new Map();
    myHero = new Hero(0, 0, map);
    mySkeleton = new Skeleton(0, 0, true);
    aList = map.getGameObjectList();
    aList.add(myHero);
    skeletonMoveCounter = 0;
    monsterList = map.getMonsterlist();
    forCounter = 0;
    setPreferredSize(new Dimension(1400, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);

    for (GameObject temp : aList) {
      PositionedImage tempImage = new PositionedImage(temp.getCostume(), temp.getPosX() * 72, temp.getPosY() * 72);
      tempImage.draw(graphics);
    }

    graphics.drawString(myHero.hudStat(),720,350);


  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    // When the up or down keys hit, we change the position of our box
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      myHero.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      myHero.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      myHero.moveRight();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      myHero.moveLeft();
    }


    if (skeletonMoveCounter == 1) {
      skeletonMoveCounter = 0;
      for (int i = 0; i < monsterList.size(); i++) {
        forCounter = 0;
        u = 0;
        d = 0;
        r = 0;
        l = 0;
        do {
          d4 = (int) (Math.random() * 4 + 1);
          if (d4 == 1 && (monsterList.get(i).getPosX() < 9) && !map.isThereWall(monsterList.get(i).getPosX() + 1, monsterList.get(i).getPosY()) && !isThereMonster(monsterList.get(i).getPosX() + 1, monsterList.get(i).getPosY()) && !isThereHero(monsterList.get(i).getPosX() + 1, monsterList.get(i).getPosY()) ) {
            monsterList.get(i).setPosX(monsterList.get(i).getPosX() + 1);
            forCounter++;
          } else if(d4 == 1) {
            u = 1;
          }else if (d4 == 2 && (monsterList.get(i).getPosX() > 0) && !map.isThereWall(monsterList.get(i).getPosX() - 1, monsterList.get(i).getPosY()) && !isThereMonster(monsterList.get(i).getPosX() - 1, monsterList.get(i).getPosY()) && !isThereHero(monsterList.get(i).getPosX() - 1, monsterList.get(i).getPosY())  ) {
            monsterList.get(i).setPosX(monsterList.get(i).getPosX() - 1);
            forCounter++;
          } else if(d4 == 2) {
            d = 1;
          }else if (d4 == 3 && (monsterList.get(i).getPosY() > 0) && !map.isThereWall(monsterList.get(i).getPosX(), monsterList.get(i).getPosY() - 1) && !isThereMonster(monsterList.get(i).getPosX(), monsterList.get(i).getPosY()- 1) && !isThereHero(monsterList.get(i).getPosX(), monsterList.get(i).getPosY() + 1)  ) {
            monsterList.get(i).setPosY(monsterList.get(i).getPosY() - 1);
            forCounter++;
          }else if(d4 == 3) {
            l = 1;
          } else if (d4 == 4 && (monsterList.get(i).getPosY() < 9) && !map.isThereWall(monsterList.get(i).getPosX(), monsterList.get(i).getPosY() + 1) && !isThereMonster(monsterList.get(i).getPosX(), monsterList.get(i).getPosY() + 1) && !isThereHero(monsterList.get(i).getPosX(), monsterList.get(i).getPosY() + 1) ) {
            monsterList.get(i).setPosY(monsterList.get(i).getPosY() + 1);
            forCounter++;
          }else if(d4 == 4) {
            r = 1;
          }
        } while (forCounter == 0 && isFour1(u,d,l,r));
      }
    } else skeletonMoveCounter++;


    repaint();
  }

  public boolean isThereHero(int x, int y) {
    if (myHero.getPosX() == x && myHero.getPosY() == y) {
      return true;
    }
    return false;
  }

  public boolean isThereMonster(int x, int y) {
    for (int i = 0; i < monsterList.size(); i++) {
      if ((monsterList.get(i).getPosY() == y) && (monsterList.get(i).getPosX() == x)) {
        return true;
      }
    }
    return false;
  }

public boolean isFour1(int u, int d, int l, int r) {
    return (u == 0 || d == 0 || l == 0 || r == 0);
}


}
