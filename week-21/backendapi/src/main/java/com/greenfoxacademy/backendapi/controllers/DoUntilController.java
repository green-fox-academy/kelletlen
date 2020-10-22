package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.models.DoUntil;
import com.greenfoxacademy.backendapi.models.Log;
import com.greenfoxacademy.backendapi.services.DoUntilService;
import com.greenfoxacademy.backendapi.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class DoUntilController {

  final
  LogService logService;

  final
  DoUntilService doUntilService;

  public DoUntilController(DoUntilService doUntilService, LogService logService) {
    this.doUntilService = doUntilService;
    this.logService = logService;
  }

  @PostMapping(value="/dountil/{action}")
  public ResponseEntity<Object> doUntil (@PathVariable String action, @RequestBody DoUntil dountil) {
      if (action.equals("sum")) {
        logService.save(new Log("/dountil/sum", "input=" + String.valueOf(dountil.getUntil())));
        return ResponseEntity.ok().body(new DoUntil(doUntilService.sum(dountil.getUntil())));
      } else if (action.equals("factor")) {
        logService.save(new Log("/dountil/factor","input=" + String.valueOf(dountil.getUntil())));
        return ResponseEntity.ok().body(new DoUntil(doUntilService.factor(dountil.getUntil())));
      } else {
        return ResponseEntity.badRequest().body(new Error("Please provide a number!"));
      }
  }
}
