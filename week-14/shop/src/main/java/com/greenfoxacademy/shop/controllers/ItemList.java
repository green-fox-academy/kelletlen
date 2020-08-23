package com.greenfoxacademy.shop.controllers;

import com.greenfoxacademy.shop.models.ShopItem;

import java.util.ArrayList;

public class ItemList {
  ArrayList <ShopItem> shopItems = new ArrayList();


  public ItemList() {
    shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5));
    shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    shopItems.add(new ShopItem("Coca cola", "0.5l standars coke", 25.0, 0));
    shopItems.add(new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100));
    shopItems.add(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));
  }

  public ArrayList<ShopItem> getShopItems() {
    return shopItems;
  }
}
