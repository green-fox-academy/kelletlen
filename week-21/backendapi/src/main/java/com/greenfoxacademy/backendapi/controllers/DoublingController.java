package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.Log;
import com.greenfoxacademy.backendapi.models.Number;
import com.greenfoxacademy.backendapi.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

  final
  LogService logService;

  public DoublingController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping(value="/doubling")
  public Object getDouble (@RequestParam(name="input", required = false) Integer input) {
  if (input != null) {
    Number number = new Number();
    number.setInput(input);
    number.setOutput(input*2);
    logService.save(new Log("/doubling", "input=" + input));
    return number;
  } else {
    return new Error("Please provide an input!");
  }
}
}
