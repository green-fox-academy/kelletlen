package com.greenfoxacademy.backendapi.models;

public class Person {
  String name;
  String title;

  public Person(String name, String title) {
    this.name = name;
    this.title = title;
  }

  public Person() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
