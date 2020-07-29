package pirates;

public class Main {
  public static void main(String[] args) {


    Pirate jack = new Pirate("Jack");
    Pirate jo = new Pirate("Jo");
    jack.brawl(jo);
    jack.howsItGoingMate();
    jo.howsItGoingMate();
    jo.drinkSomeRum();
    jack.drinkSomeRum();
    Ship ship1 = new Ship();
    ship1.fillShip();
    ship1.getShipState();
    Ship ship2 = new Ship();
    ship2.fillShip();
    ship2.getShipState();
    System.out.println(ship1.battle(ship2));
    Ship ship3 = new Ship();
    ship3.fillShip();
    Ship ship4 = new Ship();
    ship4.fillShip();
    Ship ship5 = new Ship();
    ship5.fillShip();
    Ship ship6 = new Ship();
    ship6.fillShip();
    Armada armada1 = new Armada();
    armada1.addShip(ship1);
    armada1.addShip(ship2);
    armada1.addShip(ship3);
    Armada armada2 = new Armada();
    armada2.addShip(ship4);
    armada2.addShip(ship5);
    armada2.addShip(ship6);
    System.out.println(armada1.armadaWar(armada2));
    Ship ship7 = new Ship();
    Ship ship8 = new Ship();
    armada1.addShip(ship7);
    armada1.addShip(ship8);


  }
}
