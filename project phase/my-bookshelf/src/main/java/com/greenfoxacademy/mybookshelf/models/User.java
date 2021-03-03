package com.greenfoxacademy.mybookshelf.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

  @Id
  private long id;

  @Column
  private String username;

  @Column
  private String password;

  @OneToMany
  private List<Copy> bookShelf = new ArrayList<>();

  @ManyToMany
  private Set<User> friends = new HashSet<>();
}
