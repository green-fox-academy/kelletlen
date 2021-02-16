import java.util.Scanner;

public class PartyIndicator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Number of girls:");
    int girls = scanner.nextInt();

    System.out.println("Number of boys:");
    int boys = scanner.nextInt();

    int people = boys + girls;


    if (people >= 20 && girls != boys && girls > 0) {
      System.out.println("Quite cool party!");
    } else if (people <= 20 && girls > 0) {
      System.out.println("Average party...");
    } else if (girls == 0) {
      System.out.println("Sausage party");
    } else {
      System.out.println("The party is excellent!");
    }


  }
}

