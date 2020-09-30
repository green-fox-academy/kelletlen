package com.greenfoxacademy.reddit.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;

  @Column
  String username;

  @Column
  String password;

  @OneToMany
  List<Post> post;

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public User() {
  }

  public long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
