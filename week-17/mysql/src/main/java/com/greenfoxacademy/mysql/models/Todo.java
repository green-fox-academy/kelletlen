package com.greenfoxacademy.mysql.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

  @Id
  @GeneratedValue
  long id;

  @Column
  String title;

  @Column
  boolean urgent;

  @Column
  boolean done;

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public Todo() {
  }

  public long getId() {

    return id;
  }

  public String getTitle() {

    return title;
  }

  public boolean isUrgent() {

    return urgent;
  }

  public boolean isDone() {

    return done;
  }

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
