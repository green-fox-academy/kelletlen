package streams;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise11 {
  public static void main(String[] args) throws IOException {

    List<String[]> strings = Files.lines(Paths.get("assets/text.txt"))
        .map(line -> line.replaceAll("[^a-zA-Z ]", "").split(" "))
        .collect(Collectors.toList());

    ArrayList<String> words = new ArrayList<>();


    /*Path filePath = Paths.get("assets/text.txt");
    ArrayList <String> words = new ArrayList<>();

    try {
      List<String> lines = Files.readAllLines(filePath);
      lines.stream().map(line -> Stream.of(line.split("\\s+"))).forEach(System.out::println);


    } catch (Exception e) {
      System.out.println("Could not read file");
    }*/
  }
}
/*Find a random Wikipedia article and copy the contents to a txt file.

Create a Stream expression which reads all text from this file, and prints the 100 most common words in descending order. Keep in mind that the text contains punctuation characters which should be ignored. The result should be something like this:

the: 131
of: 74
and: 48
to: 45
a: 43
in: 43
was: 30
as: 21
German: 18
for: 16
his: 15
by: 13
he: 11
that: 11
...*/