package com.greenfoxacademy.reddit.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

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

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
  }

  public Post() {
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getUrl() {
    return url;
  }

  public int getScore() {
    return score;
  }

  public Date getCreation() {
    return creation;
  }
}
