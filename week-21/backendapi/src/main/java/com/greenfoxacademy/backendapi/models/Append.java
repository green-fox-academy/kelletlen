package com.greenfoxacademy.backendapi.models;

public class Append {
  private String appended;

  public Append(String appendable, String appended) {

    this.appended = appended;
  }

  public Append() {
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
