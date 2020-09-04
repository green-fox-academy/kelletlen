package greenfoxacademy.foxclub.models;

import java.util.ArrayList;

public class Fox {
  private String name;
  private String food;
  private String drink;
  private ArrayList<String> tricks;

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    this.tricks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
