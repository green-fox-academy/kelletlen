import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = scanner.nextInt();

        for (int j=0; j<=a; j++) {
            for (int i=0; i<j; i++){
                System.out.print("*");
            }
            System.out.println();


        }
    }

}
