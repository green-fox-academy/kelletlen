import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.

    //System.out.println(getIPAddresses(readFile("log.txt")).toString());
    List<String> IPAddresses = getFragment(readFile("log.txt"), 8);

    //for (int i = 0; i < IPAddresses.size(); i++) {
    //}
    List<String> uniqueAddresses = new ArrayList<String>(new HashSet<String>(IPAddresses));
    System.out.println(uniqueAddresses.toString());

    System.out.println(getFragment(readFile("log.txt"), 11));
    List<String> postAndGet = getFragment(readFile("log.txt"), 11);
    ArrayList<String> post = new ArrayList<>();
    ArrayList<String> get = new ArrayList<>();
    for (int i = 0; i < postAndGet.size(); i++) {
      if (postAndGet.get(i).equals("POST")) {
        post.add(postAndGet.get(i));
      } else if (postAndGet.get(i).equals("GET")) {
        get.add(postAndGet.get(i));
      }
    }
    System.out.println(post);
    System.out.println(get);
  }

  public static List<String> getFragment(List<String> content, int index) {
    List<String> IPAddresses = new ArrayList<>();
    for (int i = 0; i < content.size(); i++) {
      String line = content.get(i);
      for (int j = 0; j < line.length(); j++) {
        String[] words = line.split(" ");
        IPAddresses.add(words[index]);
      }
    }
    return IPAddresses;
  }


  public static List<String> readFile(String file) {
    try {
      Path filePath = Paths.get("assets/" + file);
      return Files.readAllLines(filePath);
    } catch (Exception e) {
      System.out.println("Can't read file");
      return null;
    }
  }
}