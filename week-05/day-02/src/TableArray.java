import java.util.ArrayList;

public class TableArray {
  Hero hero = new Hero(0, 0);

  public int[][] map;
  public ArrayList<Minion> minions = new ArrayList<>();

  public int[][] getMap() {
    return map;
  }

  public TableArray() {

    this.map = new int[][]{{5, 0, 0, 1, 0, 1, 0, 0, 0, 2},
      {0, 0, 0, 1, 0, 1, 0, 1, 1, 0},
      {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
      {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
      {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
      {0, 1, 0, 1, 0, 0, 0, 0, 1, 0,},
      {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
      {0, 0, 0, 0, 0, 1, 1, 0, 1, 0,},
      {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
      {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
    };

    int counter = 0;
    do if (counter < 3) {
      int posX = (int) (Math.random() * 10);
      int posY = (int) (Math.random() * 10);
      if (map[posY][posX] == 0) {
        map[posY][posX] = 2;
        counter = counter + 1;
        Skeleton skeleton = new Skeleton(posX, posY);
        skeleton.ID = counter;
        minions.add(skeleton);
      }
    } while (counter < 3);


    counter = 0;
    do if (counter < 1) {
      int posX = (int) (Math.random() * 10);
      int posY = (int) (Math.random() * 10);
      if (map[posY][posX] == 0) {
        map[posY][posX] = 3;
        Boss boss = new Boss(posX, posY);
        minions.add(boss);
        counter = counter + 1;
      }
    } while (counter < 1);

  }

  public Minion fight(int y, int x) {
    System.out.println("this is input x:  " + x);
    System.out.println("this is input y:  " + y);
    for (int i = 0; i < minions.size() - 1; i++) {
      if ((minions.get(i).posY == y) && (minions.get(i).posX == x)) {
        System.out.println(minions.get(i).getClass());
        System.out.println(minions.get(i).ID);
        return minions.get(i);
      }
    }
    System.out.println("end of loop");
    return null;
  }

  public void attack(Minion minion) {

  }

  public String hud() {
    String hud = ("Hero Level " + hero.Level + " HP: " + hero.HP + "/" + hero.CurrentHP + " | DP: " + hero.DP + " | SP: " + hero.SP);
    return hud;
  }


}
