package streams;

import java.util.stream.Stream;

public class Exercise6 {
  public static void main(String[] args) {
    //Write a Stream Expression to find the uppercase characters in a string!
    String s = "Write a Stream Expression";
    System.out.println(s.chars()
        .filter(Character::isUpperCase)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString());

  }
}
