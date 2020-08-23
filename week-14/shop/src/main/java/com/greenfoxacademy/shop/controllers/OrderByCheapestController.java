package com.greenfoxacademy.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderByCheapestController {
  ItemList itemList = new ItemList();

  @RequestMapping(value="/webshop/orderbycheapest")
  public String renderByCheapest(Model model) {
    model.addAttribute("item", itemList.orderByCheapest());
    return "webShop";
  }
}
