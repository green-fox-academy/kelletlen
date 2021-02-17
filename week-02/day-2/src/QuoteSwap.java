import java.util.*;

public class QuoteSwap{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    // Accidentally I messed up this quote from Richard Feynman.
    // Two words are out of place
    // Your task is to fix it by swapping the right words with code
    // Create a method called quoteSwap().

    // Also, print the sentence to the output with spaces in between.
    System.out.println(quoteSwap(list));
    // Expected output: "What I cannot create I do not understand."

  }
  public static String quoteSwap (ArrayList<String> list) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals("do")) {
        list.set(i, "cannot");
      } else if (list.get(i).equals("cannot")){
        list.set(i, "do");
      }
    }
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < list.size(); i++) {
      str.append(list.get(i));
      str.append(" ");
    }
    return str.toString();
  }
}
