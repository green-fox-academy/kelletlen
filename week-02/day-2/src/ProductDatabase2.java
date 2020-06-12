import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
  public static void main(String[] args) {
    HashMap<String, Integer> productDatabase = new HashMap<>();
    productDatabase.put("Eggs", 200);
    productDatabase.put("Milk", 200);
    productDatabase.put("Fish", 400);
    productDatabase.put("Apples", 150);
    productDatabase.put("Bread", 50);
    productDatabase.put("Chicken", 550);

    System.out.println("The products, that cost more than 201:");

    for (Map.Entry<String, Integer> entry : productDatabase.entrySet()) {
      if (entry.getValue() < 201) {
        System.out.println(entry.getKey());
      }
    }

    System.out.println("The products, that cost more than 150:");

    for (Map.Entry<String, Integer> entry : productDatabase.entrySet()) {
      if (entry.getValue() > 150) {
        System.out.println(entry.getKey());
      }
    }

    /*for (Integer value : productDatabase.values()) {
      if (value < 201) {
        System.out.println();
      }
    } */

    /*Object[] array = productDatabase.values().toArray();
    Integer[] prices = new Integer[array.length];

    for (int i = 0; i < array.length; i++) {
      prices[i] = (Integer) array[i];
    }
    */
  }
}
