import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Number = scanner.nextInt();

        if (Number%2 != 0) {
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
