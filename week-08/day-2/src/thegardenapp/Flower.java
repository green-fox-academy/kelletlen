package thegardenapp;

public class Flower extends Plant {

  public Flower(String color) {
    super(color);
    this.waterAmount = 0;
  }
  @Override
  public String getKind () {

    return "Flower";
  }
  @Override
  public boolean needsWater() {
    return waterAmount < 5;
  }

  @Override
  public void absorb (float water) {
      waterAmount += (water/100)*75;
    }

}

