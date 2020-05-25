public class Sum {
    public static void main(String[] args) {

        int a = 7;
        System.out.println(Sum(a));

    }
    public static int Sum(int a) {
        int sum = 0;

        for (int j = 0; j <= a; j++) {

            sum +=j;
        }
        return sum;

    }
}
