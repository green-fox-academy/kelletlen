import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversedOrder {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    try {
      Path filePath = Paths.get("assets/reversed-order.txt");
      List<String> content = Files.readAllLines(filePath);
      Collections.reverse(content);
      Path filePath2 = Paths.get("assets/correct-order.txt");
      Files.write(filePath2, content);
    } catch (Exception e) {
      System.out.println("fail");
    }
  }
}
