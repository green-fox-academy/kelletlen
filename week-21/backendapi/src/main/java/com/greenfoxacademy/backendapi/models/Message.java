package com.greenfoxacademy.backendapi.models;

public class Message {
  String welcome_message;

  public Message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public Message() {
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
