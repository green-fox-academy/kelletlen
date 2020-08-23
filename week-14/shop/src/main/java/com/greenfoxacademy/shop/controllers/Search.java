package com.greenfoxacademy.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Search {
  ItemList itemList = new ItemList();

  @PostMapping(path= "/webshop/search")
  public String searchShop (Model model, @RequestParam(name = "search")String searchWord) {
    model.addAttribute("item", itemList.search(searchWord));
    return "webshop";
  }
}
