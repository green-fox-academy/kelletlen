package com.greenfoxacademy.shop.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockAverageRESTController {
  ItemList itemList = new ItemList();

  @RequestMapping(value="/webshop/stockaverage")
  public double getStockAverage () {
    return itemList.getStockAverage();
  }
}
