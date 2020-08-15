package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

  private static AtomicLong loadCounter = new AtomicLong();
  public static void incrementLoadCounter () {
    loadCounter.getAndIncrement();
  }


  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam(name="name", required = false) String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("counter", loadCounter);
    incrementLoadCounter();
    return "greeting";
  }
}
