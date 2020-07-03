public class power {
  public static void main(String[] args) {
    // Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

    System.out.println(powerN(4,4));

  }
  public static int powerN (int base, int n) {
    if (base <= 0 || n <= 0) return 0;
    if (base == 1) return 1;
    if (n == 1) return base;
    return base * powerN(base, (n-1));
  }

}
