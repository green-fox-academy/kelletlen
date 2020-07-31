package pirates;

import java.util.ArrayList;

public class Armada {
  ArrayList<Ship> ships;

  public Armada() {

    this.ships = new ArrayList<>();
  }

  public ArrayList<Ship> getShips() {

    return ships;
  }
  public void addShip (Ship ship) {

    ships.add(ship);
  }

  public boolean armadaWar (Armada enemy) {
    while (!this.ships.isEmpty() || !enemy.getShips().isEmpty()) {
      for (int i = 0; i < ships.size(); i++) {
        Ship currentShip = ships.get(i);
        for (int j = 0; j < enemy.getShips().size(); j++) {
          Ship enemyShip = enemy.getShips().get(j);
          if (currentShip.battle(enemyShip)) {
            enemy.getShips().remove(enemyShip);
          } else {
            ships.remove(currentShip);
          }
        }
      }
    }
    return enemy.getShips().isEmpty();
  }
}
