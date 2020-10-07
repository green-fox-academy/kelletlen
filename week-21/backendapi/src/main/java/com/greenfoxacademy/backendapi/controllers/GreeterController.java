package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.Message;
import com.greenfoxacademy.backendapi.models.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @GetMapping(value = "/greeter")
  public Object getGreeting(@RequestParam(name = "name") String name,
                            @RequestParam(name = "title") String title) {
    Person person = new Person(name, title);
    if (name != null && title != null) {
      return new Message("Oh, hi there " + person.getName() + ", my dear " + person.getTitle() + "!");
    } else if (name != null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a title!"));
    } else if (title != null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a name!"));
    } else {
      return ResponseEntity.badRequest().body(new Error("Please provide a name and a title!"));
    }
  }
}
