import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number:");
    int a = scanner.nextInt();

    float sum = 0;

    for (int i = 1; i <= a; i++) {
      System.out.println("Please enter an integer:");
      int b = scanner.nextInt();
      sum += b;
      float average = sum / a;
      if (i != a) {
      } else {
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
      }
    }
  }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
