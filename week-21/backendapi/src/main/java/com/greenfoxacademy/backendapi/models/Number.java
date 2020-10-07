package com.greenfoxacademy.backendapi.models;

public class Number {
  private int input;
  private int output;

  public Number(int input, int output) {
    this.input = input;
    this.output = output;
  }

  public Number() {
  }

  public int getInput() {
    return input;
  }

  public int getOutput() {
    return output;
  }

  public void setInput(int input) {
    this.input = input;
  }

  public void setOutput(int output) {
    this.output = output;
  }
}
