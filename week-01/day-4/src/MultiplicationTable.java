import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int n = scanner.nextInt();

        int a = 1;

        while (a<=10) {
            System.out.println(a + "*" + n + "=" + a*n);
            a++;
        }
    }
}
