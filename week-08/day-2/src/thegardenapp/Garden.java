package thegardenapp;

import java.util.ArrayList;

public class Garden {
  protected ArrayList<Plant> plants;

  public Garden() {
    this.plants = new ArrayList<>();

  }

  public void addPlants(Plant newPlant) {
    plants.add(newPlant);
  }

  public void water(float amount) {
    ArrayList<Plant> toBeWatered = new ArrayList<>();
    for (Plant p : plants) {
      if (p.needsWater()) {
        toBeWatered.add(p);
      }
    }
    System.out.println("Watering with " + amount);
    for (Plant p : toBeWatered) {
      p.absorb(amount / toBeWatered.size());

    }
  }

  public void getState() {
    for (Plant p : plants) {
      if (p.needsWater()) {
        System.out.println("The " + p.getColor() + " " + p.getKind() + " needs water");
      } else {
        System.out.println("The " + p.getColor() + " " + p.getKind() + " doesn't need water");
      }
    }
  }
}

