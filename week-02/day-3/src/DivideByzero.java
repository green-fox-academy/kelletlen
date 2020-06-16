import java.util.Scanner;

public class DivideByzero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int divisor = scanner.nextInt();

        try {
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
        // floattal miért nem működik az exception?

    }



}

