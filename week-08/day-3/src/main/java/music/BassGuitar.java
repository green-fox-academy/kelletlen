package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    numberOfStrings = 4;
    name = "Bass Guitar";
  }

  public BassGuitar(int Strings) {
    this.numberOfStrings = Strings;
    name = "Bass Guitar";
  }

  @Override
  protected String sound() {
    return "Duum-duum-duum";
  }
}
