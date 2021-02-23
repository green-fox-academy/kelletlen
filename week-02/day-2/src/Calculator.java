import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    System.out.println("Please type in the expression:");
    Scanner scanner = new Scanner(System.in);
    String [] operation = scanner.nextLine().split(" ");
    char operationChar = operation[0].charAt(0);
    int operand1 = Integer.parseInt(operation[1]);
    int operand2 = Integer.parseInt(operation[2]);
    System.out.println(calculate(operationChar, operand1, operand2));
  }

  public static int calculate(Character operation, int operand1, int operand2) {
    if (operation.equals('+')) {
      return operand1 + operand2;
    } else if (operation.equals('-')) {
      return operand1 - operand2;
    } else if (operation.equals('*')) {
      return operand1 * operand2;
    } else if (operation.equals('/')) {
      return operand1 / operand2;
    } else {
      return 0;
    }
  }
}
