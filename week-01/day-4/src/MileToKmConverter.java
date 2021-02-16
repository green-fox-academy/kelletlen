import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a double that is a distance in miles:");
    double amount = scanner.nextDouble();

    double distanceInKilometers = amount * 1.6;

    System.out.println("That equals to:" + distanceInKilometers + "km");
  }
}


