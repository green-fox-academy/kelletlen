package com.greenfoxacademy.mybookshelf.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
  @Id
  private Long id;

  @Column
  private String title;

  @Column
  private String author;

  @Column
  private String description;

  @Column
  private int year;

  @OneToMany
  private List<Copy> copies = new ArrayList<>();
}
