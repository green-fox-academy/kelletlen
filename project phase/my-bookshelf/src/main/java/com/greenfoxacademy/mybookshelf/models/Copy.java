package com.greenfoxacademy.mybookshelf.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Copy {
  @Id
  private long id;

  @ManyToOne
  private Book book;

  @Column
  private int year;

  @Column
  private String publisher;

}
