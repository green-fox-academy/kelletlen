package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.Array;
import com.greenfoxacademy.backendapi.models.Log;
import com.greenfoxacademy.backendapi.services.ArrayService;
import com.greenfoxacademy.backendapi.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class ArrayHandler {

  final
  LogService logService;

  final
  ArrayService arrayService;

  public ArrayHandler(ArrayService arrayService, LogService logService) {
    this.arrayService = arrayService;
    this.logService = logService;
  }

  @PostMapping(value = "/arrays")
  public ResponseEntity<Object> handleArray(@RequestBody Array array) {
    if (array.getNumbers() == null || array.getWhat().equals(" ")) {
      return ResponseEntity.badRequest().body(new Error("Please provide what to do with the numbers!"));
    }
    logService.save(new Log("/arrays", array.getWhat() + ", " + Arrays.toString(array.getNumbers())));
    return ResponseEntity.ok().body(arrayService.calculate(array));
  }
}
