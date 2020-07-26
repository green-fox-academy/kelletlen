public class Sum {
  public static void main(String[] args) {
    int a = 7;
    System.out.println(sum(a));
  }

  public static int sum(int a) {
    int sum = 0;
    for (int j = 0; j <= a; j++) {
      sum += j;
    }
    return sum;
  }
}
