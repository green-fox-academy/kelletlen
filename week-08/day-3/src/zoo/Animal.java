package zoo;

public abstract class Animal {
  String name;
  int age;
  String gender;


  public String getName() {
    return name;
  }

  protected abstract String breed();

  protected abstract void move();

  protected abstract void eat();


}
