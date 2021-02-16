public class Reverse2 {
  public static void main(String[] args) {
    int[] numbers = {3, 4, 5, 6, 7};
    int counter = numbers.length - 1;
    for (int i = 0; i < numbers.length / 2; i++) {
      int temp = numbers[i];
      numbers[i] = numbers[counter];
      numbers[counter] = temp;
      counter--;
    }

    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]);
    }
  }
}
// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`
