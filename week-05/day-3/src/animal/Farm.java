package animal;

import java.util.ArrayList;

public class Farm {

  /* Reuse your Animal class
Create a Farm class
it has list of Animals
it has slots which defines the number of free places for animals
breed() -> creates a new animal if there's place for it
slaughter() -> removes the least hungry animal*/
  private int slots;
  private Animal[] animals = new Animal[slots];

  public Farm(int slots) {
    this.slots = slots;
    animals = new Animal[slots];
  }

  public void breed (Animal animal) {
    for (int i = 0; i < slots; i++) {
      if (animals[i] == null) {
        animals[i] = animal;
        break;
      }
    }
    // breed funkció valamiért nem működik

  }
}
