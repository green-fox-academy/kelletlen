package printable;

public class Todo implements Printable {
  String task;
  String priority;
  boolean isItDone;

  public Todo(String task, String priority, boolean isItDone) {
    this.task = task;
    this.priority = priority;
    this.isItDone = isItDone;
  }

  @Override
  public void printAllFields() {
    System.out.println("Task: " + this.task + " | Priority: " + this.priority + " | Done: " + this.isItDone);
  }
}
