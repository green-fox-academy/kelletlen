public class stringsAgainAndAgain {
  public static void main(String[] args) {
    //Given a string, compute recursively a new string where all the adjacent chars are now separated by a *
    System.out.println(separate("asdasdasdasd"));
  }

  public static String separate(String input) {
    if (input.isEmpty()) return "";
    char c = input.charAt(0);
    return Character.toString(c) + '*' + separate(input.substring(1));
  }
}