package com.greenfoxacademy.todos.models;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

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

  @CreationTimestamp
  @Temporal(TemporalType.DATE)
  @Column
  java.util.Date creation;

  @Temporal(TemporalType.DATE)
  @Column
  java.util.Date dueDate;

  @ManyToOne
  Assignee assignee;

  public Todo(String title, boolean urgent) {
    this.title = title;
    this.urgent = urgent;
    this.done = false;
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

  public Date getCreation() {
    return creation;
  }

  public java.util.Date getDueDate() {
    return dueDate;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public String getAssigneeName() {
    return this.assignee.getName();
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
    assignee.getTodoList().add(this);
  }

  public void setDueDate(Date dueDate) {

    this.dueDate = dueDate;
  }

  public String getDueDateString() {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    return formatter.format(this.dueDate);
  }
}
