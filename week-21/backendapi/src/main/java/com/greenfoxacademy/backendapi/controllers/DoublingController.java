package com.greenfoxacademy.backendapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

@GetMapping(value="/doubling")
  public int getDouble (@RequestParam(name="input", required = false) int input) {
   return input*2;
}
}
