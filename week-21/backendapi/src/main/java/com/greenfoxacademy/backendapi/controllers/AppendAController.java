package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.Append;
import com.greenfoxacademy.backendapi.models.Log;
import com.greenfoxacademy.backendapi.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

  final
  LogService logService;

  public AppendAController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping(value = "/appenda/{appendable}")
  public ResponseEntity<Object> getAppended(@PathVariable String appendable) {
    if (appendable != null) {
      Append append = new Append();
      append.setAppended(appendable.concat("a"));
      logService.save(new Log("/appenda", "input=" + appendable));
      return ResponseEntity.ok().body(append);
    } else {
      return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
    }
  }
}
