package animal;

public class Main {
  public static void main(String[] args) {
    Farm farm = new Farm(3);
    Animal animal = new Animal();
    farm.breed(animal);
  }
}
