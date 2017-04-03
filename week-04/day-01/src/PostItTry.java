import java.awt.*;

public class PostItTry {
  public static void main(String[] args) {
    postIt firstPostIt = new postIt();
    firstPostIt.backGroundColor = Color.orange;
    firstPostIt.text = "idea1";
    firstPostIt.textColor = Color.blue;

    postIt secondPostIt = new postIt();
    secondPostIt.backGroundColor = Color.pink;
    secondPostIt.text = "awsome";
    secondPostIt.textColor = Color.black;

    postIt thirdPostIt = new postIt();
    thirdPostIt.backGroundColor = Color.yellow;
    thirdPostIt.text = "Superb";
    thirdPostIt.textColor = Color.green;

    firstPostIt.readPostit();
    secondPostIt.readPostit();
    thirdPostIt.readPostit();

  }
}