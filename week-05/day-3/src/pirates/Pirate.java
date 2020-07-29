package pirates;

public class Pirate {
  int intoxication;
  boolean isAlive;
  boolean asleep;
  String name;

  public Pirate(String name) {
    this.intoxication = 0;
    this.isAlive = true;
    this.asleep = false;
    this.name = name;
  }
  public Pirate () {
    this.intoxication = 0;
    this.isAlive = true;
    this.asleep = false;
  }

  public void drinkSomeRum() {
    if (isAlive) {
      intoxication ++;
    } else {
      System.out.println("He's dead");
    }
  }
  public void howsItGoingMate() {
    if (isAlive && intoxication < 5) {
      System.out.println("Pour me anudder!");
    } else if (isAlive && intoxication >= 5) {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      asleep = true;
    } else if (!isAlive) {
      System.out.println("He's dead");
    }
  }
  public void die() {
    isAlive = false;
  }
  public void brawl(Pirate enemy) {
    int chance = (int) (Math.random()* 3 +1);
    if (chance == 1) {
      this.die();
    } else if (chance == 2) {
      enemy.die();
    } else if (chance == 3) {
      this.asleep = true;
      enemy.asleep = true;
      System.out.println("Oh no, they both passed out.");
    }
  }

  public int getIntoxication() {
    return intoxication;
  }

  public boolean getIsAlive() {
    return isAlive;
  }
}
