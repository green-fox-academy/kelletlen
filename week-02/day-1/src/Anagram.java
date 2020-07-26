import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    System.out.println(isAnagram("silent", "listen"));
    System.out.println(isAnagram("silent", "apple"));
    System.out.println(isAnagram("silent","purple"));
  }

  public static boolean isAnagram(String string1, String string2) {
    char[] array1 = string1.toCharArray();
    char[] array2 = string2.toCharArray();
    Arrays.sort(array1);
    Arrays.sort(array2);
    int counter = 0;
    if (array1.length != array2.length) {
      return false;
    } else {
      for (int i = 0; i < array1.length; i++) {
        if (array1[i] == array2[i]) {
          counter++;
        }
      }
    }
    return counter == array1.length;
  }
}

