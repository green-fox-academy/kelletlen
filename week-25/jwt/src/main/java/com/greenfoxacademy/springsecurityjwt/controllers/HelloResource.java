package com.greenfoxacademy.springsecurityjwt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResource {

  @GetMapping(path = "/hello")
  public String hello() {
    return "Hello World";
  }
}
