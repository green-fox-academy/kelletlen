import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of chickens: ");
    int chickens = scanner.nextInt();
    System.out.println("Please enter the number of pigs: ");
    int pigs = scanner.nextInt();
    int chickenLegs = chickens*2;
    int pigLegs = pigs*4;
    int animalLegs = chickenLegs + pigLegs;
    System.out.println("The animals have " + animalLegs + " legs.");
  }
}
