package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.BankAccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DecimalFormat;

@Controller
public class Show {

  BankAccountList list = new BankAccountList();
  private static DecimalFormat df2 = new DecimalFormat("0.00");
  //ezt nem tudom, hova kéne tenni


  @GetMapping(path="/show")
  public String showAccount (Model model) {
    model.addAttribute("account", list.getAccounts());
    return "index";
  }
}
