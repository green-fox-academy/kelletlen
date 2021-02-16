package com.greenfoxacademy.backendapi.models;

public class Array {
  String what;
  int[] numbers;

  public Array(String what, int[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

  public Array() {
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  public String numbersToString() {
    return numbers.toString();
  }
}
