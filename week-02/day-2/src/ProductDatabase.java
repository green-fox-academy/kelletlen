import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.List;

public class ProductDatabase {
  public static void main(String[] args) {
    HashMap<String, Integer> productDatabase = new HashMap<>();
    productDatabase.put("Eggs", 200);
    productDatabase.put("Milk", 200);
    productDatabase.put("Fish", 400);
    productDatabase.put("Apples", 150);
    productDatabase.put("Bread", 50);
    productDatabase.put("Chicken", 550);

    System.out.println("The price of the fish is: " + productDatabase.get("Fish"));

    Object[] array = productDatabase.values().toArray();

    Integer[] prices = new Integer[array.length];

    for (int i = 0; i < array.length; i++) {
      prices[i] = (Integer) array[i];
    }
    Arrays.sort(prices);
    int mostExpensive = prices[prices.length - 1];

    for (Map.Entry<String, Integer> entry : productDatabase.entrySet()) {
      if (entry.getValue().equals(mostExpensive)) {
        System.out.println("The most expensive product is: " + entry.getKey());
      }
    }

    int sum = 0;
    for (int i = 0; i < prices.length; i++) {
      sum += prices[i];
    }
    int average = sum / prices.length;
    System.out.println("The average price is: " + average);

    int below300 = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < 300) {
        below300 = below300 + 1;
      }
    }
    System.out.println("Products below 300: " + below300);

    List<Integer> pricesList = Arrays.asList(prices);

    if (pricesList.contains(125)) {
      System.out.println("Yes, there is something we can buy for exactly 125.");
    } else {
      System.out.println("No, we can't buy anything for exactly 125.");
    }

    int cheapest = prices[0];

    for (Map.Entry<String, Integer> entry : productDatabase.entrySet()) {
      if (entry.getValue().equals(cheapest)) {
        System.out.println("The cheapest product is: " + entry.getKey());
      }
    }
  }
}

  /* Create an application which solves the following problems.

    How much is the fish?
    What is the most expensive product?
    What is the average price?
    How many products' price is below 300?
    Is there anything we can buy for exactly 125?
    What is the cheapest product? */
