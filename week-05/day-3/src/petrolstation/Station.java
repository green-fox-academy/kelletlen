package petrolstation;

public class Station {
  private int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void refill(Car car) {
    gasAmount = gasAmount - car.getCapacity();
    car.getGas();

  }
}
