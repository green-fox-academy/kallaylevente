public class Tiles extends GameObject{
  private boolean isWall;

  public Tiles(int posX, int posY, boolean isWall) {
    super(posX,posY, isWall ? ("assets/wall.png") : ("assets/floor.png") );
  }

  public boolean isWall() {
    return isWall;
  }

}
