import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = scanner.nextInt();

        float sum = 0;

        for (int i = 1; i<= a; i++) {
            System.out.println("Please enter an integer:");
            int b = scanner.nextInt();
            sum += b;
            float average = sum/a;
            if (i != a) {
            } else {
                System.out.println("Sum: " + sum);
                System.out.println("Average: " + average);
            }

        }

    }
}
