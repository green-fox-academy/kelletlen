package streams;

import java.util.stream.Stream;

public class Exercise8 {
  public static void main(String[] args) {
    //Write a Stream Expression to concatenate a Character list to a string!
    Character[] chars = {'a', 's', 'd'};
    System.out.println(Stream.of(chars).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString());
  }
}
