import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    System.out.println(copyFile("my-file.txt", "copy-to.txt"));

  }

  public static boolean copyFile(String copyFrom, String copyTo) {
    try {
      Path filePath = Paths.get("assets/" + copyFrom);
      List<String> content = Files.readAllLines(filePath);
      Path filePath2 = Paths.get("assets/" + copyTo);
      Files.write(filePath2, content);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}

