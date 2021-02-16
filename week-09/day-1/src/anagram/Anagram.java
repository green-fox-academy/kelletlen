package anagram;

import java.util.Arrays;

public class Anagram {
  public boolean isAnagram(String string1, String string2) {
    if (string1.length() != string2.length()) {
      return false;
    }
    string1 = string1.toLowerCase();
    string2 = string2.toLowerCase();
    char[] c1 = string1.toCharArray();
    char[] c2 = string2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);
    String stringc1 = new String(c1);
    String stringc2 = new String(c2);
    return stringc1.equals(stringc2);
  }
}

