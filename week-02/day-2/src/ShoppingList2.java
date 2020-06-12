import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
  public static void main (String [] args) {
    HashMap<String, Double> products = new HashMap<>();

    products.put("Milk", 1.07);
    products.put("Rice", 1.59);
    products.put("Eggs", 3.14);
    products.put("Cheese", 12.60);
    products.put("Chicken Breasts", 9.40);
    products.put("Apples", 2.31);
    products.put("Tomato", 2.58);
    products.put("Potato", 1.75);
    products.put("Onion", 1.10);

    HashMap<String, Integer> BobsList = new HashMap<>();

    BobsList.put("Milk", 3);
    BobsList.put("Rice", 2);
    BobsList.put("Eggs", 2);
    BobsList.put("Cheese", 1);
    BobsList.put("Chicken Breasts", 4);
    BobsList.put("Apples", 1);
    BobsList.put("Tomato", 2);
    BobsList.put("Potato", 1);

    HashMap<String, Integer> AlicesList = new HashMap<>();

    AlicesList.put("Rice", 1);
    AlicesList.put("Eggs", 5);
    AlicesList.put("Chicken Breasts", 2);
    AlicesList.put("Apples", 1);
    AlicesList.put("Tomato", 10);

    double sum = 0;

    for (Map.Entry<String, Integer> entry: BobsList.entrySet()) {
      for (Map.Entry<String, Double> product : products.entrySet()) {
        if (entry.getKey().equals(product.getKey())) {
          double partAmount = entry.getValue() * product.getValue();
          sum = sum + partAmount;
        }
      }
    }
    System.out.println("Bob has to pay " + sum);




  }
}

