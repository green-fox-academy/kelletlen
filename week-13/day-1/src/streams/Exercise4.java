package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Exercise4 {
  public static void main(String[] args) {

    // Write a Stream Expression to get the average value of the odd numbers from the following list:

    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

    IntSummaryStatistics stats = numbers.stream().filter(p -> p%2 ==1 || p%2 == -1).mapToInt((p) ->p).summaryStatistics();
    System.out.println(stats.getAverage());
  }
}
