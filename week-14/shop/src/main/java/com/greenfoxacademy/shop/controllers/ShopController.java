package com.greenfoxacademy.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopController {
  ItemList itemList = new ItemList();

  @GetMapping(path="/webshop")
  public String renderShop(Model model) {
    model.addAttribute("item", itemList.getShopItems());
    return "webShop";
  }


}
