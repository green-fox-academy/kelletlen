package aircraftcarrier;

public abstract class Aircraft {
  int maxAmmo;
  int baseDamage;
  int ammo = 0;
  boolean priority;
  int allDamage;
  int toFill = maxAmmo - ammo;

  protected int fight() {
    int damage = baseDamage * ammo;
    this.ammo = 0;
    allDamage += damage;
    return damage;

  }

  protected int refill(int number) {
    if (number > toFill) {
      ammo = maxAmmo;
      return number - toFill;
    } else if (number <= toFill) {
      ammo += number;
    }
    return 0;
  }

  protected abstract String getType();

  protected abstract String getStatus();

  protected abstract boolean isPriority();

  protected int getToFill() {
    return toFill;
  }

}
