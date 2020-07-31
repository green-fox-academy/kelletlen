package fleetofthings;

import java.util.Comparator;

public class Thing implements Comparable <Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing other) {
    int result = - Boolean.compare(this.completed, other.isCompleted());
    if (result != 0) {
      return result;
    }
    if (result == 0) {
      result = this.name.compareTo(other.getName());
    }
    return result;
  }

  public String getName() {
    return name;
  }

  public boolean isCompleted() {
    return completed;
  }
}
