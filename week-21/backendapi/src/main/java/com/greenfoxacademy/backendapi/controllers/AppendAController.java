package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.Append;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

  @GetMapping(value="/appenda/{appendable}")
  public ResponseEntity<Object> getAppended(@PathVariable String appendable) {
    if (appendable != null) {
      Append append = new Append();
      append.setAppended(appendable.concat("a"));
      return ResponseEntity.ok().body(append);
    } else {
      return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
    }
  }
}
