import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MapIntroduction2 {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("978-1-60309-452-8", "A Letter to Jo");
    map.put("978-1-60309-459-7", "Lupus");
    map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
    map.put("978-1-60309-461-0", "The Lab");

    for (Entry<String, String> item : map.entrySet()) {
      System.out.println(item.getValue() + "(ISBN: " + item.getKey() + ")");
    }

    map.remove("978 - 1 - 60309 - 444 - 3");
    map.remove("The Lab");

    map.put("978-1-60309-450-4", "They Called Us Enemy");
    map.put("978-1-60309-453-5", "Why Did We Trust Him?");

    for (Entry<String, String> item : map.entrySet()) {
      if (item.getKey() == "478-0-61159-424-8") {
        System.out.println("There is an associated value with key 478-0-61159-424-8");
        break;
      } else {
        System.out.println("There isn't an associated value with key 478-0-61159-424-8");
        break;
      }
    }
    System.out.println(map.get("978-1-60309-453-5"));
  }
}