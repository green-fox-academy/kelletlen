package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRESTController {

  @RequestMapping(value="/greeting")
  public Greeting greet (@RequestParam(name="name", required = false) String name) {
    Greeting g = new Greeting(1, "Hello" + name);
    Greeting.incrementGreetCount();
    return g;
  }
}
