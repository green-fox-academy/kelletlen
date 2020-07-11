package charsequence;

public class Main {
  public static void main(String[] args) {
    Gnirts g = new Gnirts("asdasd");
    System.out.println(g.length());
    System.out.println(g.charAt(3));
    System.out.println(g.subSequence(2, 4));

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
  }
}
