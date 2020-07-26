import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    int[] array = unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34});
    System.out.println(Arrays.toString(array));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  public static int[] unique(int[] numbers) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Arrays.sort(numbers);
    for (int i = 0; i < numbers.length; i++) {
      if (i != numbers.length - 1) {
        if (numbers[i] != numbers[i + 1]) {
          arrayList.add(numbers[i]);
        }
      } else if (numbers[i] != numbers[i - 1]) {
        arrayList.add(numbers[i]);
      }
    }
    int[] uniqueNumbers = new int[arrayList.size()];
    for (int i = 0; i < arrayList.size(); i++) {
      uniqueNumbers[i] = arrayList.get(i);
    }
    return uniqueNumbers;
  }
}


