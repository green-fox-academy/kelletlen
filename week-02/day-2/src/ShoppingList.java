import java.util.ArrayList;

public class ShoppingList<i> {
  public static void main(String[] args) {
    ArrayList<String> shoppingList = new ArrayList();

    shoppingList.add("eggs");
    shoppingList.add("milk");
    shoppingList.add("fish");
    shoppingList.add("apples");
    shoppingList.add("bread");
    shoppingList.add("chicken");

    if (shoppingList.contains("milk")) {
      System.out.println("We have milk on the list.");
    }
    if (shoppingList.contains("bananas")) {
      System.out.println("We have bananas on the list.");
    } else {
      System.out.println("We do not have bananas on the list, just a bunch of dead animals and the breast milk of a cow.");
    }
  }
}
