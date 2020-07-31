package fleetofthings;

import java.util.ArrayList;
import java.util.Collections;

public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main` method
    // - Download those, use those
    // - In the main method create a fleet
    // - Achieve this output:
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing thing1 = new Thing("Get milk");
    Thing thing2 = new Thing("Remove the obstacles");
    Thing thing3 = new Thing("Stand up");
    Thing thing4 = new Thing("Eat lunch");


    //Fleet fleet1 = new Fleet();
    //fleet1.add(thing1);
    //fleet1.add(thing2);
    //fleet1.add(thing3);
    //fleet1.add(thing4);

    thing3.complete();
    thing4.complete();

    ArrayList <Thing> things = new ArrayList<>();
    things.add(thing1);
    things.add(thing2);
    things.add(thing3);

    //System.out.println(fleet1.toString());
    Collections.sort(things);
    System.out.println(things);


  }
}
