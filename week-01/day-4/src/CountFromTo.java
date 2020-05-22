import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = scanner.nextInt();

        System.out.println("Please enter a second number:");
        int b = scanner.nextInt();

        if (b<=a) {
            System.out.println("The second number should be bigger");
        }
        else {
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        }

    }
}
