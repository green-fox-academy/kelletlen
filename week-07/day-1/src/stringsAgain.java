public class stringsAgain {
  public static void main(String[] args) {
    //Given a string, compute recursively a new string where all the 'x' chars have been removed.
    System.out.println(removeX("asdasdaxxxxxxasdxxasd"));

  }
  public static String removeX (String input) {
    if (input.isEmpty()) return "";
    char c = input.charAt(0);
    if (c != 'x') {
      return c + removeX(input.substring(1));
    } else {
      return removeX(input.substring(1));
    }
  }
}
