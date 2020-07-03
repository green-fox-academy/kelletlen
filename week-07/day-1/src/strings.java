public class strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
    System.out.println(changeXtoY("asdasdxxxxasdxxxdasd"));
  }
  public static String changeXtoY (String input) {
    if (input.isEmpty()) return "";
    char c = input.charAt(0);
    if (c != 'x') {
      return c + changeXtoY(input.substring(1));
    } else {
      return 'y' + changeXtoY(input.substring(1));
    }

  }
}
