package printable;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Domino domino1 = new Domino(3,4);
    Domino domino2 = new Domino(2, 5);
    Domino domino3 = new Domino(1, 6);

    ArrayList<Domino> dominoes = new ArrayList<>();
    dominoes.add(domino1);
    dominoes.add(domino2);
    dominoes.add(domino3);

    Todo todo1 = new Todo("Go shopping", "high", false);
    Todo todo2 = new Todo("Wash dishes", "low", true);
    Todo todo3 = new Todo("Call mom", "high", false);

    ArrayList<Todo> todos = new ArrayList<>();
    todos.add(todo1);
    todos.add(todo2);
    todos.add(todo3);

    for (Domino d : dominoes) {
      d.printAllFields();
    }

    for (Todo t : todos) {
      t.printAllFields();
    }
  }
}
