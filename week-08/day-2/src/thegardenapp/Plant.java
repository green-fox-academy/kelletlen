package thegardenapp;

import java.awt.*;

public class Plant {
  protected String color;
  protected float waterAmount;

  public Plant(String color) {
    this.color = color;
    this.waterAmount = 0;
  }

  public float getWaterAmount() {

    return waterAmount;
  }

  public String getColor() {

    return color;
  }

  public boolean needsWater() {

    return waterAmount < 1;
  }

  public void absorb(float water) {

    waterAmount += water;
  }

  public String getKind() {

    return "Plant";
  }

}
