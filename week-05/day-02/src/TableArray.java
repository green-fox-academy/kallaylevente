public class TableArray {
 public int[][] wallPosition;

  public int[][] getWallPosition() {
    return wallPosition;
  }

  public TableArray() {
      this.wallPosition = new int[][]{{5, 0, 0, 1, 0, 1, 0, 0, 0, 0},
      {5, 0, 0, 1, 0, 1, 0, 1, 1, 0},
      {0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
      {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
      {1, 1, 1, 1, 0, 1, 1, 1, 1, 0},
      {0, 1, 0, 1, 0, 0, 0, 0, 1, 0,},
      {0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
      {0, 0, 0, 0, 0, 1, 1, 0, 1, 0,},
      {0, 1, 1, 1, 0, 0, 0, 0, 1, 0},
      {0, 0, 0, 1, 0, 1, 1, 0, 1, 0},
    };

      int counter = 0;
      do if (counter < 3){
        int posX = (int)(Math.random() * 10);
        int posY = (int)(Math.random() * 10);
        if (wallPosition[posY][posX] == 0) {
          wallPosition[posY][posX] = 2;
          counter = counter + 1;
        }
      } while (counter < 3);

      counter = 0;
    do if (counter < 1){
      int posX = (int)(Math.random() * 10);
      int posY = (int)(Math.random() * 10);
      if (wallPosition[posY][posX] == 0) {
        wallPosition[posY][posX] = 3;
        counter = counter + 1;
      }
    } while (counter < 1);

  }
}
