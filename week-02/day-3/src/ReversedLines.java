import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    // Create a method that decrypts reversed-lines.txt
    try {
      Path filePath = Paths.get("assets/reversed-lines.txt");
      List<String> content = Files.readAllLines(filePath);
      List<String> newContent = new ArrayList<>();
      Path filePath2 = Paths.get("assets/correct-lines.txt");
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < content.size(); i++) {
        String line = content.get(i);
        sb.append(reverseString(line));
        sb.append("\n");
      }
      newContent.add(sb.toString());
      Files.write(filePath2, newContent);
    } catch (Exception e) {
      System.out.println("fail");
    }
  }

  public static String reverseString(String toBeReversed) {
    String reversed = "";

    for (int i = 0; i < toBeReversed.length(); i++) {
      char lastChar = toBeReversed.charAt(toBeReversed.length() - 1 - i);
      reversed += lastChar;
    }
    return reversed;
  }
}
