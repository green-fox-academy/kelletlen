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

  @ManyToOne
  User user;

  public Post(String title, String url) {
    this.title = title;
    this.url = url;
    this.score = 0;
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
  public void increaseScore () {
    this.score = this.score +1;
  }
  public void decreaseScore () {
    this.score = this.score-1;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
