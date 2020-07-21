package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    numberOfStrings = 6;
    name = "Electric Guitar";
  }

  public ElectricGuitar(int Strings) {
    this.numberOfStrings = Strings;
    name = "Electric Guitar";
  }

  @Override
  protected String sound() {
    return "Twang";
  }
}
