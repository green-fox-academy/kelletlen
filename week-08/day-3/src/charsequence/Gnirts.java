package charsequence;

public class Gnirts implements CharSequence {
protected String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {

    return string.length();
  }

  @Override
  public char charAt(int index) {

    return string.charAt(string.length() - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {

    return string.subSequence(start, end);
  }
}
