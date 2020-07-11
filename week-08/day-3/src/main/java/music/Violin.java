package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    numberOfStrings = 4;
    name = "Violin";
  }
  public Violin (int Strings) {
    this.numberOfStrings = Strings;
    name= "Bass Guitar";
  }

  @Override
  protected String sound() {
    return "Screech";
  }
}
