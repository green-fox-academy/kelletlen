import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a number:");
    int lines = scanner.nextInt();
    if (lines % 2 == 0) {
      lines++;
    }

    for (int i = 0; i <= lines / 2; i++) {
      int asterisks = (i * 2) + 1;
      int spaces = (lines - asterisks) / 2;
      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < asterisks; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i <= lines / 2; i++) {
      int spaces = i + 1;
      int asterisks = (lines - 2 * spaces);
      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < asterisks; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

