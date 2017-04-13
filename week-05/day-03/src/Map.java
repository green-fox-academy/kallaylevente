import java.util.ArrayList;
import java.util.List;

public class Map {
  List<GameObject> GameObjectList = new ArrayList<>();
  List<GameObject> monsterList = new ArrayList<>();

  public List<GameObject> getGameObjectList() {
    return GameObjectList;
  }

  private int[][] map = new int[][]{{0, 0, 0, 1, 0, 1, 0, 0, 0, 2},

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


  public List<GameObject> getMonsterlist() {
    return monsterList;
  }

  public Map() {
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j] == 1) {
          GameObjectList.add(new Tiles(i, j, true));
        } else {
          GameObjectList.add(new Tiles(i, j, false));
        }
      }
    }
    int counter = 0;
    do if (counter < 3) {
      int posX = (int) (Math.random() * 10);
      int posY = (int) (Math.random() * 10);

      if (map[posX][posY] == 0) {
        counter = counter + 1;
        Skeleton skeleton = new Skeleton(posX,posY,true);
        GameObjectList.add(skeleton);
        monsterList.add(skeleton);
      }
    } while (counter < 3);

    counter = 0;
    do if (counter < 1) {
      int posX = (int) (Math.random() * 10);
      int posY = (int) (Math.random() * 10);
      if (map[posX][posY] == 0) {
        Boss boss = new Boss(posX,posY,true);
        GameObjectList.add(boss);
        monsterList.add(boss);
        counter = counter + 1;
      }
    } while (counter < 1);

  }

  public boolean isThereWall(int x, int y) {

      return (map[x][y] == 1);

  }


}

