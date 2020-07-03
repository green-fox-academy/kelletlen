public class bunnies {
  public static void main(String[] args) {
    //We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
    System.out.println(countBunnyEars(6));

  }
  public static int countBunnyEars( int numberOfBunnies) {
    if (numberOfBunnies < 0 ) return 0;
    if (numberOfBunnies == 0) return 0;
    if (numberOfBunnies == 1) return 2;
    return numberOfBunnies * countBunnyEars(1);
  }
}
