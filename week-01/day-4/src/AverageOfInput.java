import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    System.out.println("Please enter 5 numbers: ");
    Scanner scanner = new Scanner(System.in);
    int numbers = scanner.nextInt();
    int number1 = numbers / 10000;
    int number5 = numbers % 10;
    int number4 = (numbers % 100) / 10;
    int number3 = (numbers % 1000) / 100;
    int number2 = (numbers % 10000) / 1000;
    int sum = number1 + number2 + number3 + number4 + number5;
    double average = sum / 5;
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);

  }
}
