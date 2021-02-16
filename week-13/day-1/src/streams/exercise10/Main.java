package streams.exercise10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    ArrayList<Fox> foxes = new ArrayList<>();
    foxes.add(new Fox("Foxy", "red", 3));
    foxes.add(new Fox("Vuk", "orange", 2));
    foxes.add(new Fox("Pete", "green", 2));
    foxes.add(new Fox("Susie", "green", 6));
    foxes.add(new Fox("Mimi", "green", 8));
    foxes.stream().filter(fox -> fox.getColor().equals("green")).forEach(System.out::println);
    foxes.stream().filter(fox -> fox.getColor().equals("green")).filter(fox -> fox.getAge() < 5).forEach(System.out::println);
    Map foxesFrequencyByColor =
        foxes.stream().collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
    System.out.println(foxesFrequencyByColor);
  }
}

 /* Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

    Write a Stream Expression to find the foxes with green color!
    Write a Stream Expression to find the foxes with green color, and age less then 5 years!
    Write a Stream Expression to find the frequency of foxes by color!*/