package aircraftcarrier;

public class F16 extends Aircraft {

  public F16() {
    this.maxAmmo = 8;
    this.baseDamage = 30;
    this.priority = false;
  }

  @Override
  protected String getType() {
    return "F16";
  }

  @Override
  protected String getStatus() {
    return "Type " + getType() + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage + ", All Damage: " + allDamage;
  }

  @Override
  protected boolean isPriority() {
    return priority;
  }
}

