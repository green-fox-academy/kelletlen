package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.Array;
import com.greenfoxacademy.backendapi.services.ArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandler {

  final
  ArrayService arrayService;

  public ArrayHandler(ArrayService arrayService) {
    this.arrayService = arrayService;
  }

  @PostMapping(value="/arrays")
  public ResponseEntity<Object> handleArray (@RequestBody Array array) {
    if (array.getNumbers() == null || array.getWhat().equals(" ")) {
      return ResponseEntity.badRequest().body(new Error("Please provide what to do with the numbers!"));
    }
    return ResponseEntity.ok().body(arrayService.calculate(array));
  }
}
