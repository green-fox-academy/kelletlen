package com.greenfoxacademy.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StockAverageRESTController {
  ItemList itemList = new ItemList();

  @RequestMapping(value = "/webshop/stockaverage")
  public String getStockAverage(Model model) {
    model.addAttribute("item", "Average stock:" + itemList.getStockAverage());
    return "forSingleData";
  }
}
