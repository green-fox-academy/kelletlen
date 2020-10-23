package com.greenfoxacademy.backendapi.models;

public class Text {
  String text;

  public Text(String text) {
    this.text = text;
  }

  public Text() {
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
