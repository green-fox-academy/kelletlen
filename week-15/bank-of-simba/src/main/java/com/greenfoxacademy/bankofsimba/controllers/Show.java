package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.BankAccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class Show {

  BankAccountList list = new BankAccountList();

  @GetMapping(path="/show")
  public String showAccount (Model model) {
    model.addAttribute("accounts", list.getAccounts());
    return "index";
  }

  @PostMapping(path="/raise")
  public String raiseAccount (Model model, @RequestParam(name="name") String accountToIncrease) {
    list.raise(accountToIncrease);
    model.addAttribute("accounts", list.getAccounts());
    return "index";
  }
}
