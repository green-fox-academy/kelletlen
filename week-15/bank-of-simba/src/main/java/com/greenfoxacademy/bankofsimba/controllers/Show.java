package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DecimalFormat;

@Controller
public class Show {
  BankAccount account = new BankAccount("Simba", 2000, "lion");
  private static DecimalFormat df2 = new DecimalFormat("0.00");

  @GetMapping(path="/show")
  public String showAccount (Model model) {
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", df2.format(account.getBalance()) +" Zebra");
    model.addAttribute("type", account.getAnimalType());
    return "index";
  }
}
