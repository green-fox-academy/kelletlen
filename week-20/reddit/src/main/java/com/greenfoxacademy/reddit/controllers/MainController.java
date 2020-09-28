package com.greenfoxacademy.reddit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
  @GetMapping(value={"/"})
  public String getPosts () {
    return "index";
  }
}
