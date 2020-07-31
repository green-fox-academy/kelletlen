package zoo;

public class Reptile extends Animal {
  public Reptile(String name) {
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
}
