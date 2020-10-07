package com.greenfoxacademy.backendapi.models;

public class DoUntil {
  int until;

  public DoUntil(int until) {
    this.until = until;
  }

  public DoUntil() {
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
