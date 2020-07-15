package thegardenapp;

public class Plant {
  private String color;
  protected float waterAmount;

  public Plant(String color) {
    this.color = color;
    this.waterAmount = 0;
  }

  public float getWaterAmount() {

    return waterAmount;
  }
  public boolean needsWater() {
   return waterAmount < 1;
  }

  public void absorb (int water) {
    waterAmount += water;
  }

}
