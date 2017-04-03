import java.awt.*;

public class PostItTry {
  public static void main(String[] args) {
    postIt firstPostIt = new postIt();
    firstPostIt.backGroundColor = Color.orange;
    firstPostIt.text = "idea1";
    firstPostIt.textColor = Color.blue;
    System.out.println("bg: " + firstPostIt.backGroundColor + ", text: " + firstPostIt.text + " textColor is : " + firstPostIt.textColor);

    postIt secondPostIt = new postIt();
    secondPostIt.backGroundColor = Color.pink;
    secondPostIt.text = "awsome";it ad
    secondPostIt.textColor = Color.black;
    System.out.println("bg: " + secondPostIt.backGroundColor + ", text: " + secondPostIt.text + " textColor is : " + secondPostIt.textColor);

    postIt thirdPostIt = new postIt();
    thirdPostIt.backGroundColor = Color.yellow;
    thirdPostIt.text = "Superb";
    thirdPostIt.textColor = Color.green;
    System.out.println("bg: " + thirdPostIt.backGroundColor + ", text: " + thirdPostIt.text + " textColor is : " + thirdPostIt.textColor);
  }
}