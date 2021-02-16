import java.util.*;

public class AppendLetter{
  public static void main(String... args){
    List<String> animals = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
    // Create a method called "appendA()" that adds "a" to every string in the "animals" list.
    // The parameter should be a list.

    System.out.println(appendA(animals));
  }
  public static List<String> appendA(List<String> animals) {
    List<String> list = new ArrayList<>();
    for (int i = 0; i < animals.size(); i++) {
      list.add(animals.get(i) + "a");
    }
    return list;
  }
}
