package com.greenfoxacademy.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContainsNikeController {
  ItemList itemList = new ItemList();

  @RequestMapping(value="/webshop/containsnike")
  public String listContainsNike (Model model) {
    model.addAttribute("item", itemList.containsNike());
    return "webShop";
  }
}
