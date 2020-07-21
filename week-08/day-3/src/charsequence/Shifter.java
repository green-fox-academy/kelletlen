package charsequence;

public class Shifter implements CharSequence {
  protected String toBeShifted;
  protected int shiftWith;

  public Shifter(String toBeShifted, int shiftWith) {
    this.toBeShifted = toBeShifted;
    this.shiftWith = shiftWith;
  }

  @Override
  public int length() {

    return toBeShifted.length()- shiftWith;
  }

  @Override
  public char charAt(int index) {

    return toBeShifted.charAt(index + shiftWith);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return toBeShifted.subSequence(start +shiftWith, end + shiftWith);
  }
}
