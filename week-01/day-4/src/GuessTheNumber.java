import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Guess the number:");
        int a = scanner.nextInt();

        int b = 7;

        while (a != b) {

            if (a < b) {
                System.out.println("The stored number is higher");

            } else if (a > b) {
                System.out.println("The stored number is lower");
            }
            System.out.println("Guess the number:");
            a = scanner.nextInt();

        }

        System.out.println("You found the number:" + b);

    }

}
        //if (a<b) {
            //System.out.println("The stored number is higher");
        //} else if (a>b) {
            //System.out.println("The stored number is lower");
       // } else {
            //System.out.println("You found the number:" + b );
       // }

