package thegardenapp;

public class Plant {
  private String color;
  private float waterAmount;

  public Plant(String color) {
    this.color = color;
    this.waterAmount = 0;
  }

  public float getWaterAmount() {
    return waterAmount;
  }

}
