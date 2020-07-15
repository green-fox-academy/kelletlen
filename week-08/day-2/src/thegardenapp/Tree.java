package thegardenapp;

public class Tree extends Plant {

  public Tree(String color) {
    super(color);
    this.waterAmount = 0;
  }

  @Override
   public boolean needsWater() {
   return waterAmount < 10;
   }

   @Override
   public void absorb (int water) {
      waterAmount += (water/100)*40;
    }
}

