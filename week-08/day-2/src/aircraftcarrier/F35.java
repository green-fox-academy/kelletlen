package aircraftcarrier;

public class F35 extends Aircraft {
  public F35() {
    this.maxAmmo = 12;
    this.baseDamage = 50;
    this.priority = true;

  }

  @Override
  protected String getType() {
    return "F35";
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
