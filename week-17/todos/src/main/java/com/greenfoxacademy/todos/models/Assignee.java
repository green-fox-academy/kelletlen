package com.greenfoxacademy.todos.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {
  @Id
  @GeneratedValue
  long id;

  @Column
  String name;

  @Column
  String email;

  @OneToMany
  List<Todo> todoList;

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public Assignee() {
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTodoList() {
    return todoList;
  }
}
