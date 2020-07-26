public class PalindromeBuilder {
  public static void main(String[] args) {
    System.out.println(createPalindrome("whatever"));
}
public static String createPalindrome (String input) {
  char[] array = input.toCharArray();
  int counter = array.length -1;
  for (int i = 0; i < array.length/2 ; i++) {
    char temp = array[i];
    array[i] = array[counter];
    array[counter] = temp;
    counter --;
  }
  String reversedInput = String.valueOf(array);
  return input + reversedInput;
  }
}
