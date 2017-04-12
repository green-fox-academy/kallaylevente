import java.util.ArrayList;
import java.util.List;

public class Map {
  List<GameObject> GameObjectList = new ArrayList<>();

  public List<GameObject> getGameObjectList() {
    return GameObjectList;
  }

  private int[][] map = new int[][]{{0, 0, 0, 1, 0, 1, 0, 0, 0, 0},

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


  public Map() {
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        if (map[i][j] == 0) {
          GameObjectList.add(new Tiles(i,j,false));
        }else {
          GameObjectList.add(new Tiles(i,j, true));
        }
      }
    }
  }

  public boolean isThereWall(int x,int y){
    if (map[x][y] == 1) {
      return true;
    }
    else  return false;
  }


}

