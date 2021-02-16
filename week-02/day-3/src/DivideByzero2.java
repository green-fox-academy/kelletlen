import java.util.Scanner;

public class DivideByzero2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter a number:");
    int divisor = scanner.nextInt();

    DivideByZero(divisor);

  }

  public static void DivideByZero(int a) {

    try {
      System.out.println(10 / a);
    } catch (ArithmeticException e) {
      System.out.println("Can't divide by zero!");
    }

  }
}
