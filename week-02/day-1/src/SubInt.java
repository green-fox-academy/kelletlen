import java.util.ArrayList;
import java.util.Arrays;

public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    int[] array1 = subInt(1, new int[]{1, 11, 34, 52, 61});
    int[] array2 = subInt(9, new int[]{1, 11, 34, 52, 61});

    System.out.println(Arrays.toString(array1));
    //  should print: `[0, 1, 4]`
    System.out.println(Arrays.toString(array2));
    //  should print: '[]'
  }

  public static int[] subInt(int number, int[] array) {
    ArrayList<Integer> arrayList = new ArrayList();
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 10 == number || array[i] == number || array[i] / 10 == number) {
        arrayList.add(i);
      }
    }
    int[] indices = new int[arrayList.size()];
    for (int i = 0; i < arrayList.size(); i++) {
      indices[i] = arrayList.get(i);
    }
    return indices;
  }
}
