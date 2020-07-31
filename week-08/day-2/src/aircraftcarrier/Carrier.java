package aircraftcarrier;

import java.util.ArrayList;

public class Carrier {
  ArrayList<Aircraft> fleet;
  int ammoStore;
  int hp;

  public Carrier(ArrayList<Aircraft> fleet, int ammoStore, int hp) {
    this.fleet = fleet;
    this.ammoStore = ammoStore;
    this.hp = hp;
  }

  public void add(Aircraft a) {
    this.fleet.add(a);
  }

  public void fill() throws Exception {
    int neededAmmo = 0;
    for (Aircraft a : this.fleet) {
      neededAmmo += a.getToFill();
    }
    if (ammoStore >= neededAmmo) {
      for (Aircraft a : this.fleet) {
        a.refill(a.getToFill());
      }
    } else if (ammoStore < neededAmmo) {
      for (Aircraft a : this.fleet) {
        if (a.isPriority()) {
          a.refill(a.getToFill());
        }
      }
      if (ammoStore > 0) {
        for (Aircraft a : this.fleet) {
          if (!a.isPriority()) {
            a.refill(a.getToFill());
          }
        }
      }
    }
    if (ammoStore == 0) {
      throw new Exception("Ammo storage is empty.");
    }
  }
}
