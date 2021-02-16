import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt
    try {
      Path filePath = Paths.get("assets/duplicated-chars.txt");
      List<String> content = Files.readAllLines(filePath);
      List<String> newContent = new ArrayList<>();
      Path filePath2 = Paths.get("assets/chars.txt");
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < content.size(); i++) {
        String line = content.get(i);
        for (int j = 0; j < line.length(); j++) {
          if (j % 2 == 0) {
            sb.append(line.charAt(j));
          }
        }
        sb.append("\n");
      }
      newContent.add(sb.toString());
      Files.write(filePath2, newContent);
    } catch (Exception e) {
      System.out.println("fail");
    }
  }
}
