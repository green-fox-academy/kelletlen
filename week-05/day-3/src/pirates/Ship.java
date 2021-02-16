package pirates;

import java.util.ArrayList;

public class Ship {
  ArrayList<Pirate> pirates;
  Pirate captain;


  public Ship() {
    this.pirates = new ArrayList<>();

  }

  public void fillShip() {
    int crewNumber = (int) (Math.random() * 50 + 1);
    for (int i = 0; i < crewNumber; i++) {
      pirates.add(new Pirate());
    }
    this.captain = new Pirate("Captain");
  }

  public void getShipState() {
    System.out.println("This ship has " + pirates.size() + " pirates on it.");
    System.out.println("The captain has consumed " + captain.getIntoxication() + " glasses of rum.");

    System.out.println("The number of alive pirates in the crew: " + this.getAlivePirates());
  }

  public int getAlivePirates() {
    int lifeCounter = 0;
    for (int i = 0; i < pirates.size(); i++) {
      if (pirates.get(i).getIsAlive()) {
        lifeCounter++;
      }
    }
    return lifeCounter;
  }

  public boolean battle(Ship enemy) {
    int scoreOfThis = this.getAlivePirates() - captain.getIntoxication();
    int scoreOfEnemy = enemy.getAlivePirates() - captain.getIntoxication();
    if (scoreOfThis > scoreOfEnemy) {
      this.win();
      enemy.lose();
      return true;
    } else if (scoreOfEnemy > scoreOfThis) {
      enemy.win();
      this.lose();
      return false;
    } else {
      this.battle(enemy);
    }
    return false;
  }

  public void lose() {
    int numberOfDeaths = (int) (Math.random() * pirates.size() + 1);
    for (int i = 0; i < numberOfDeaths; i++) {
      pirates.get(i).die();
    }
  }

  public void win() {
    int numberOfRum = (int) (Math.random() * 20 + 1);
    for (int i = 0; i < pirates.size(); i++) {
      for (int j = 0; j < numberOfRum; j++) {
        pirates.get(i).drinkSomeRum();
      }
    }
  }
}

