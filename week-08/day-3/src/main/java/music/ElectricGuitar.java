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
  public String sound() {
    return "Twang";

  }


  /*@Override
  protected void play() {
    System.out.println(name + ", a " + numberOfStrings + "-stringed instrument that goes " + this.sound());
  }*/
}
