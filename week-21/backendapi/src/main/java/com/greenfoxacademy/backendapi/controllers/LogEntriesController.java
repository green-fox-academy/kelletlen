package com.greenfoxacademy.backendapi.controllers;

import com.greenfoxacademy.backendapi.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogEntriesController {
  final
  LogService logService;

  public LogEntriesController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping(value="/log")
  public ResponseEntity <Object> getLogs () {

    return ResponseEntity.ok().body(logService.getLogEntries());
  }
}
