package thegardenapp;

public class Flower extends Plant {

  public Flower(String color) {
    super(color);
    this.waterAmount = 0;
  }
  @Override
  public boolean needsWater() {
    return waterAmount < 5;
  }

  @Override
  public void absorb (int water) {
      waterAmount += (water/100)*75;
    }
}

