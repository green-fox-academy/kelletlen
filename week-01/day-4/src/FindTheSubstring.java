public class FindTheSubstring {
  public static void main(String[] args) {
    //  Create a function that takes two strings as a parameter
    //  Returns the starting index where the second one is starting in the first one
    //  Returns `-1` if the second string is not in the first one

    //  Example:

    //  should print: `17`
    System.out.println(subStr("this is what I'm searching in", "searching"));

    //  should print: `-1`
    System.out.println(subStr("this is what I'm searching in", "not"));
  }

  public static int subStr(String input, String q) {
    int indexWord = 0;
    String s = "";

    if (input.contains(q)) {
      String[] arrOfStr = input.split(" ");
      for (int i = 0; i < arrOfStr.length; i++) {
        if (arrOfStr[i].equals(q)) {
          indexWord = i;
          for (int j = 0; j < i; j++) {
            s += arrOfStr[j];
          }
        }
      }
      char[] cArray = s.toCharArray();
      return cArray.length + indexWord;
    } else {
      return -1;
    }
  }
}
