import java.util.ArrayList;

public class ArmstrongNumber {
  /*What is Armstrong number?
An Armstrong number is an n-digit number that is equal to the sum of the nth powers of its digits.

Let's demonstrate this for a 4-digit number: 1634 is a 4-digit number, raise each digit to the fourth power, and add: 1^4 + 6^4 + 3^4 + 4^4 = 1634, so it is an Armstrong number.
For a 3-digit number: 153 is a 3-digit number, raise each digit to the third power, and add: 1^3 + 5^3 + 3^3 = 153, so it is an Armstrong number.
Exercise
Write a simple program to check if a given number is an armstrong number. The program should ask for a number. E.g. if we type 371, the program should print out: The 371 is an Armstrong number.*/

  public static void main(String[] args) {
    System.out.println(armstrongCheck(1634));
  }

  public static String armstrongCheck(int number) {
    int originalNumber = number;
    ArrayList<Integer> numbers = new ArrayList<>();
    while (number != 0) {
      numbers.add(number % 10);
      number /= 10;
    }
    int result = 0;
    for (int i = 0; i < numbers.size(); i++) {
      result += Math.pow(numbers.get(i), numbers.size());
    }
    if (result == originalNumber) {
      return "The " + originalNumber + " is an Armstrong number.";
    } else {
      return "The " + originalNumber + " is not an Armstrong number.";
    }
  }
}
