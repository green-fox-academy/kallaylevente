public class Counter {
  int number;
  int workWith;

  public Counter() {
    this.number = 0;
    this.workWith = 0;
  }


  public Counter(int baseValue) {
    this.number = baseValue;
    this.workWith = baseValue;
  }

  public int add(int whatWeAdd) {
    workWith = workWith + whatWeAdd;
    return workWith;
  }

  public void add() {
    workWith++;

  }

  public int get() {
    return workWith;
  }

  public int reset() {
    workWith = this.number;
    return workWith;
  }

}
