import java.util.Arrays;

public class Bubble {
  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
    int[] array1 = new int[]{34, 12, 24, 9, 5};
    int[] array2 = new int[]{34, 12, 24, 9, 5};

    System.out.println(Arrays.toString(bubble(array1)));
    //  should print [5, 9, 12, 24, 34]
    System.out.println(Arrays.toString(advancedBubble(array2, true)));
    //  should print [34, 24, 12, 9, 5]
  }

  public static int[] bubble(int[] numbers) {
    Arrays.sort(numbers);
    return numbers;
  }

  public static int[] advancedBubble(int[] numbers, boolean b) {
    if (b) {
      Arrays.sort(numbers);
      int counter = numbers.length - 1;
      for (int i = 0; i < numbers.length / 2; i++) {
        int temp = numbers[i];
        numbers[i] = numbers[counter];
        numbers[counter] = temp;
        counter--;
      }
    }
    return numbers;
  }
}
