package countletters;

import java.util.Arrays;
import java.util.HashMap;

public class CountLetters {
  public HashMap<Character, Integer> countLetters(String input) {
    HashMap<Character, Integer> dictionary = new HashMap<>();
    input = input.toLowerCase().replace(" ", "").replace(".", "");
    char[] characters = input.toCharArray();
    Arrays.sort(characters);
    for (int i = 0; i < characters.length; i++) {
      if (!dictionary.containsKey(characters[i])) {
        dictionary.put(characters[i], 1);
      } else {
        dictionary.put(characters[i], dictionary.get(characters[i]) + 1);
      }
    }
    return dictionary;
  }
}

