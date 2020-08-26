package com.greenfoxacademy.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLception {
  String s = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

  @GetMapping(path="/string")
  public String displayString (Model model) {
    model.addAttribute("string", s);
    return "index";
  }


}
