package com.greenfoxacademy.todos.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Todo {

  long id;
  String title;
  boolean urgent;
  boolean done;


}
