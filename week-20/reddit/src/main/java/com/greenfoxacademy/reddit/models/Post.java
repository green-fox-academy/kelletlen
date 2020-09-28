package com.greenfoxacademy.reddit.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

@Entity
public class Post {

  @Id
  @GeneratedValue
  long id;

  @Column
  String title;

  @Column
  String url;

  @Column
  int score;

  @CreationTimestamp
  @Temporal(TemporalType.DATE)
  @Column
  java.util.Date creation;

}
