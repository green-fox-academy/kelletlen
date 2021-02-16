import java.util.Scanner;

public class OneTwoALot {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int Number = scanner.nextInt();

    if (Number <= 0) {
      System.out.println("Not enough");
    } else if (Number == 1) {
      System.out.println("One");
    } else if (Number == 2) {
      System.out.println("Two");
    } else {
      System.out.println("a lot");
    }
  }
}
