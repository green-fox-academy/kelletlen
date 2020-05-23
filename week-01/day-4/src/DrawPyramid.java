import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = scanner.nextInt();

        for(int j=1; j<=a; j++){
            for(int i=1; i<=(a-j); i++) {
                System.out.print(" ");
            }
            for(int k=0; k < (j + (j-1)); k++) {
                System.out.print("*");
            }
            for(int l=1; l<= (a-j); l++){
                System.out.print(" ");
            }
            System.out.println();
        }

}
}
