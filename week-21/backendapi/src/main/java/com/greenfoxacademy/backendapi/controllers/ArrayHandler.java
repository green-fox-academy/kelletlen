package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.Array;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandler {

  @PostMapping(value="/arrays")
  public ResponseEntity<Object> handleArray (@RequestBody Array array) {

  }
}
