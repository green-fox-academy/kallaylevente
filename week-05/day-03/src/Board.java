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
  Hero myHero ;
  Skeleton mySkeleton;
  int skeletonMoveCounter;
  List<Skeleton> skeletonList = new ArrayList<>();
  int d4 ;
  int forCounter;


  public Board() {
    testBoxX = 300;
    testBoxY = 300;
    map = new Map();
    myHero = new Hero(0,0,map);
    mySkeleton = new Skeleton(0,0,true);
    aList = map.getGameObjectList();
    aList.add(myHero);
    skeletonMoveCounter = 0;
    skeletonList = map.getSkeletonList();
    forCounter = 0;



    // set the size of your draw board
    setPreferredSize(new Dimension(720, 720));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);



    for (GameObject temp: aList) {
      PositionedImage tempImage = new PositionedImage(temp.getCostume(),temp.getPosX() * 72,temp.getPosY() * 72);
      tempImage.draw(graphics);
    }

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
      myHero.moveUp();
    } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
      myHero.moveDown();
    } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
      myHero.moveRight();
    } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
      myHero.moveLeft();
    }
    // and redraw to have a new picture with the new coordinates


    if (skeletonMoveCounter == 1) {
        skeletonMoveCounter = 0;
      for (int i = 0; i < skeletonList.size(); i++) {
        forCounter = 0;
        do{
          d4 = (int) (Math.random() * 4);
          if (d4 == 1 && (skeletonList.get(i).getPosX() < 9) && !map.isThereWall(skeletonList.get(i).getPosX()+1,skeletonList.get(i).getPosY())){
            skeletonList.get(i).setPosX(skeletonList.get(i).getPosX()+1);
            forCounter++;
          } else if (d4 == 2 && (skeletonList.get(i).getPosX() > 0) && !map.isThereWall(skeletonList.get(i).getPosX()-1,skeletonList.get(i).getPosY())) {
            skeletonList.get(i).setPosX(skeletonList.get(i).getPosX() - 1);
            forCounter++;
          } else if (d4 == 3 && (skeletonList.get(i).getPosY() > 0) && !map.isThereWall(skeletonList.get(i).getPosX(),skeletonList.get(i).getPosY() - 1)) {
            skeletonList.get(i).setPosY(skeletonList.get(i).getPosY() - 1);
            forCounter++;
          }else if (d4 == 4 && (skeletonList.get(i).getPosY() < 9) && !map.isThereWall(skeletonList.get(i).getPosX(),skeletonList.get(i).getPosY() + 1)) {
            skeletonList.get(i).setPosY(skeletonList.get(i).getPosY() + 1);
            forCounter++;
          }
        }while (forCounter == 0);
      }
    } else skeletonMoveCounter ++;

    repaint();
  }
}
