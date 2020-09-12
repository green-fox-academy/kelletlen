package com.greenfoxacademy.todos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("todo")
public class TodoController {

  @GetMapping(value = {"list", "/"})
  public String list() {
    return "";
  }
}
