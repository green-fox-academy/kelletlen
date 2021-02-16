package com.greenfoxacademy.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ListOnlyAvailableController {
  ItemList itemList = new ItemList();


  @RequestMapping(value = "/webshop/listavailable")
  public String renderAvailable(Model model) {
    model.addAttribute("item", itemList.getAvailableItems());
    return "webShop";
  }
}
