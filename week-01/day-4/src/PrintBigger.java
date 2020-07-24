import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    System.out.println("Please enter first number: ");
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    System.out.println("Please enter second number: ");
    int number2 = scanner.nextInt();
    if (number1> number2) {
      System.out.println("The bigger number is " + number1);
    } else if (number2>number1) {
      System.out.println("The bigger number is " + number2);
    } else {
      System.out.println("The numbers are even.");
    }
  }
}
