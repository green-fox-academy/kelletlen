public class numberAdder {
  public static void main(String[] args) {
    //Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

    System.out.println(addNumbers(5));

  }
  public static int addNumbers(int n) {
    if(n == 1) {
      return 1;
    } if (n< 1) {
      return 0;
    } else {
      return n + addNumbers(n-1);}

  }
}
