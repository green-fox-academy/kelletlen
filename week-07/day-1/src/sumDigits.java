public class sumDigits {
  public static void main(String[] args) {
    //Given a non-negative integer n, return the sum of its digits recursively (without loops).
    System.out.println(getSumOfDigits(145));

  }

  public static int getSumOfDigits(int n) {
    if (n < 0) return 0;

    if (n == 1) return 1;

    return n % 10 + getSumOfDigits(n / 10);
  }
}
