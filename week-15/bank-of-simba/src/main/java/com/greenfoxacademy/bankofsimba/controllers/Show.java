package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Show {
  BankAccount account = new BankAccount("Simba", 2000, "lion");

  @GetMapping(path="/show")
  public String showAccount (Model model) {
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("type", account.getAnimalType());
    return "index";
  }
}
