package com.greenfoxacademy.bankofsimba.models;

import java.text.DecimalFormat;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private static DecimalFormat df2 = new DecimalFormat("0.00");
  private boolean isKing;
  private String moralAttitude;



  public BankAccount(String name, double balance, String animalType, boolean isKing, String moralAttitude) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.moralAttitude = moralAttitude;
  }

  public String getName() {

    return name;
  }

  public String getBalance() {

    return df2.format(balance);
  }

  public String getAnimalType() {

    return animalType;
  }
  public boolean isKing() {

    return isKing;
  }

  public String getMoralAttitude() {
    return moralAttitude;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }
}
