package com.greenfoxacademy.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GetMostExpensiveRESTController {
  ItemList itemList = new ItemList();

  @RequestMapping(value="/webshop/mostexpensive")
  public String getMostExpensive (Model model) {
    model.addAttribute("item", "Most expensive item: " + itemList.getMostExpensive());
    return "forSingleData";
  }
}
