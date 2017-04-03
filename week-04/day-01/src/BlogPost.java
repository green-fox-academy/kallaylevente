public class BlogPost {
  String authorName;
  String title;
  String text;
  String publicationDate;



  public BlogPost(String name,String title, String text,String date) {
    this.authorName = name;
    this.title = title;
    this.text = text;
    this.publicationDate = date;
  }

  public void content(){
    System.out.println("authorname is :" + authorName + ", title is :" + title + ", the text on it is :" + text + ", publication date is :" + publicationDate);
  }
}
