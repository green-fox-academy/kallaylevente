public class GameObject {
  private int posX;
  private int posY;
  private String costume;

  public int getPosX() {
    return posX;
  }

  public GameObject(int posX, int posY) {

    this.posX = posX;
    this.posY = posY;
  }

  public void setPosX(int posX) {
    this.posX = posX;

  }

  public void setCostume(String costume) {
    this.costume = costume;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

  public GameObject(int posX, int posY, String costume) {
    this.posX = posX;

    this.posY = posY;
    this.costume = costume;
  }

  public String getCostume() {
    return costume;
  }

  public GameObject() {
  }
}
