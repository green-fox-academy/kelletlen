package greenfoxacademy.foxclub.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Fox {
  @Id
  @GeneratedValue
  long id;

  @Column
  private String name;

  @Column
  private String food;

  @Column
  private String drink;

  @Column
  private ArrayList<String> tricks;

  @OneToOne
  User user;

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    this.tricks = new ArrayList<>();
  }

  public Fox() {
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

  public void addTrick(String trick) {
    tricks.add(trick);
  }
}
