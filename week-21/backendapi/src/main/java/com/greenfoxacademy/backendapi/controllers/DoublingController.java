package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.Number;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

@GetMapping(value="/doubling")
  public Object getDouble (@RequestParam(name="input") Integer input) {
  if (input != null) {
    Number number = new Number();
    number.setInput(input);
    number.setOutput(input*2);
    return number;
  } else {
    return new Error("Please provide an input!");
  }
}
}
