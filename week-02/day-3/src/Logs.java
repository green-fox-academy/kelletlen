import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.

    System.out.println(getIPAddresses("log.txt"));

  }
  public static List<String> getIPAddresses (String file) {
    try {
      Path filePath = Paths.get("assets/" + file);
      List<String> content = Files.readAllLines(filePath);
      List<String> IPAddresses = new ArrayList<>();
      for (int i = 0; i < content.size() ; i++) {
        String line = content.get(i);
        String IPAddress = IPAddresses.get(i);
        for (int j = 0; j < line.length() ; j++) {
          String [] words = line.split(" ");
           IPAddress = words[5];
        }
      }
      return IPAddresses;
    } catch (Exception e){
      System.out.println("Can't read file");
    }
  }
}
