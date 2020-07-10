package thegardenapp;

public class Flower extends Plant {
  private float waterAmount;

  public Flower(String color) {
    super(color);
    this.waterAmount = 0;
  }

  @Override
  public float getWaterAmount() {
    return super.getWaterAmount();
  }
  public boolean needsWater() {
    if (getWaterAmount() < 5 ) {
      return true;
    }
    return false;
  }
  public void absorb (int water) {
    if (needsWater() == true) {
      waterAmount += (water/100)*75;
    }
  }
}
