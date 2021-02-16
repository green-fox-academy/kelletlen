package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    numberOfStrings = 4;
    name = "Violin";
  }

  public Violin(int Strings) {
    numberOfStrings = Strings;
    name = "Violin";
  }

  @Override
  protected String sound() {

    return "Screech";
  }
}
