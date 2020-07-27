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

    HashMap<String, Integer> bobsList = new HashMap<>();

    bobsList.put("Milk", 3);
    bobsList.put("Rice", 2);
    bobsList.put("Eggs", 2);
    bobsList.put("Cheese", 1);
    bobsList.put("Chicken Breasts", 4);
    bobsList.put("Apples", 1);
    bobsList.put("Tomato", 2);
    bobsList.put("Potato", 1);

    HashMap<String, Integer> alicesList = new HashMap<>();

    alicesList.put("Rice", 1);
    alicesList.put("Eggs", 5);
    alicesList.put("Chicken Breasts", 2);
    alicesList.put("Apples", 1);
    alicesList.put("Tomato", 10);

    double bobsBill = 0;

    for (Map.Entry<String, Integer> entry: bobsList.entrySet()) {
      for (Map.Entry<String, Double> product : products.entrySet()) {
        if (entry.getKey().equals(product.getKey())) {
          double partAmount = entry.getValue() * product.getValue();
          bobsBill = bobsBill + partAmount;
        }
      }
    }
    System.out.println("Bob has to pay " + bobsBill);

    double alicesBill = 0;

    for (Map.Entry<String, Integer> entry : alicesList.entrySet()) {
      for (Map.Entry<String, Double> product: products.entrySet()) {
        if (entry.getKey().equals(product.getKey())) {
          double partAmount = entry.getValue()*product.getValue();
          alicesBill = alicesBill + partAmount;
        }
      }
    }
    System.out.println("Alice has to pay " + alicesBill);

    if (alicesList.get("Rice") > bobsList.get("Rice")) {
      System.out.println("Alice buys more rice.");
    } else if (bobsList.get("Rice") > alicesList.get("Rice")) {
      System.out.println("Bob buys more rice.");
    }
    if (alicesList.containsKey("Potato") && bobsList.containsKey("Potato")) {
      if (alicesList.get("Potato") > bobsList.get("Potato")) {
        System.out.println("Alice buys more potato.");
      } else if (bobsList.get("Potato") > alicesList.get("Potato")) {
        System.out.println("Bob buys more potato.");
      }
    } else {
      if (alicesList.containsKey("Potato")) {
        System.out.println("Alice buys more potato.");
      } else if (bobsList.containsKey("Potato")) {
        System.out.println("Bob buys more potato.");
      }
    }
    if (alicesList.size() < bobsList.size()) {
      System.out.println("Bob buys more different products");
    } else if (alicesList.size() > bobsList.size()) {
      System.out.println("Alice buys more different products");
    }
    int billsProducts = 0;
    for (Map.Entry<String, Integer> entry : bobsList.entrySet()) {
      billsProducts += entry.getValue();
    }
    int alicesProducts = 0;
    for (Map.Entry<String, Integer> entry: alicesList.entrySet()) {
      alicesProducts += entry.getValue();
    }
    if (billsProducts > alicesProducts) {
      System.out.println("Bill buys more products");
    } else if (alicesProducts > billsProducts) {
      System.out.println("Alice buys more products");
    } else {
      System.out.println("They buy the equal amount of products");
    }
  }
}

