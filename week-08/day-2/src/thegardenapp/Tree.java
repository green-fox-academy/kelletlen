package thegardenapp;

public class Tree extends Plant {

  public Tree(String color) {
    super(color);
    this.waterAmount = 0;
  }
  @Override
  public String getKind () {
    return "Tree";
  }

  @Override
   public boolean needsWater() {
   return waterAmount < 10;
   }

   @Override
   public void absorb (float water) {
    waterAmount += (water/100)*40;
    }
}

