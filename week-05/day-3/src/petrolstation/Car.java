package petrolstation;

public class Car {
  private int gasAmount;
  private int capacity;

  public Car() {
    this.gasAmount = 0;
    this.capacity = 100;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getGasAmount() {
    return gasAmount;
  }
  public void getGas() {

    gasAmount += capacity;
  }
}
