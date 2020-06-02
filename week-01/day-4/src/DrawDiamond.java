import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = scanner.nextInt();

        for (int j = 1; j<=a/2; j++) {

            for (int i = 1; i<=(a-j); i++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=(j + (j-1)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = a/2-1; i > 0; i--) {
            for (int j = 1; j <= a/2-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
