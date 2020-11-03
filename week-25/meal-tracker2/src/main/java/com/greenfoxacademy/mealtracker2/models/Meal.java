package com.greenfoxacademy.mealtracker2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Meal {

  @Id
  @GeneratedValue
  long id;

  @Column
  String name;

  @Column
  int calories;

  @Column
  Date date;

  public Meal(String name, int calories, Date date) {
    this.name = name;
    this.calories = calories;
    this.date = date;
  }

  public Meal() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCalories() {
    return calories;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
