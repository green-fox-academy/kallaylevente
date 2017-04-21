import java.time.LocalDate;

public class ListItem {

  private String task;
  private boolean isDone;
  private LocalDate date;

  public boolean isDone() {
    return isDone;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ListItem(String task, boolean isDone, LocalDate date) {
    this.date = date;
    this.task = task;
    this.isDone = isDone;
  }

  public String toString() {
    if (this.isDone) {
      return "[x] " + this.task + " " + this.date;
    } else {
      return "[ ] " + this.task + " " + this.date;
    }
  }

  public String toFile() {
    return this.task + ";" + (this.isDone ? 1 : 0) + ";" + date;
  }

  public void setDone(boolean done) {
    isDone = done;
  }
}
