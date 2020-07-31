package countletters;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    CountLetters cl = new CountLetters();
    HashMap <Character, Integer> test = cl.countLetters("Sometimes the easiest solution is the right one.");

    for (Map.Entry<Character, Integer> entry: test.entrySet()) {
      System.out.println("[ " + entry.getKey() + " : " + entry.getValue() + " ]");
    }
  }
}
