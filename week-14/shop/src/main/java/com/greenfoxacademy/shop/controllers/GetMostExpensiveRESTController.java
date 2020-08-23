package com.greenfoxacademy.shop.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMostExpensiveRESTController {
  ItemList itemList = new ItemList();

  @RequestMapping(value="/webshop/mostexpensive")
  public String getMostExpensive () {
    return itemList.getMostExpensive();
  }
}
