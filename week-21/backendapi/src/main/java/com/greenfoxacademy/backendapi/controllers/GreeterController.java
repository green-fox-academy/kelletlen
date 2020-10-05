package com.greenfoxacademy.backendapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @GetMapping(value="/greeter")
  ResponseEntity<String> getGreeting (@RequestParam(name="name") String name,
                                      @RequestParam(name="title") String title) {
    return new ResponseEntity<>("Hello " + name + " my dear " + title);
  }
}
