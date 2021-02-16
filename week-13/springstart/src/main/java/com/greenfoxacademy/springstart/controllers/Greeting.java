package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private long id;
  private String content;
  private static AtomicLong greetCount = new AtomicLong();


  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {

    return id;
  }

  public String getContent() {

    return content;
  }

  public AtomicLong getGreetCount() {

    return greetCount;
  }

  public static void incrementGreetCount() {

    greetCount.getAndIncrement();
  }
}
