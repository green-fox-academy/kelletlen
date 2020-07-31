package zoo;

import flyable.Flyable;

public class Bird extends Animal implements Flyable {
  public Bird(String name) {
    this.name = name;
  }

  @Override
  protected String breed() {
    return "laying eggs";
  }

  @Override
  protected void move() {

  }

  @Override
  protected void eat() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void land() {

  }

  @Override
  public void takeOff() {

  }
}
