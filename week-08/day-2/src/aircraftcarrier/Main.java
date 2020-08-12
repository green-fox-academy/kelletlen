package aircraftcarrier;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Aircraft red1 = new F16();
    Aircraft red2 = new F16();
    Aircraft blue1 = new F35();
    Aircraft blue2 = new F35();
    System.out.println(red1.getStatus());
    System.out.println(red1.refill(10));
    System.out.println(red1.getStatus());
    System.out.println(red2.getStatus());
    System.out.println(red2.refill(4));
    System.out.println(blue1.getStatus());
    System.out.println(blue1.refill(12));
    System.out.println(blue1.getStatus());
    System.out.println(blue2.refill(15));
    System.out.println(blue2.getStatus());
    System.out.println(blue2.fight());
    System.out.println(blue2.getStatus());

    ArrayList<Aircraft> fleet1 = new ArrayList<>();
    fleet1.add(red1);
    fleet1.add(blue1);
    fleet1.add(blue2);
    Carrier carrier1 = new Carrier(fleet1,100, 30);
    try {
      carrier1.fill();
    } catch (Exception e) {
      System.out.println("Ammo storage is empty.");
    }

  }
}
