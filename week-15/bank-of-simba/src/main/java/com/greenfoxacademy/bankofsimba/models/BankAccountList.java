package com.greenfoxacademy.bankofsimba.models;

import java.util.ArrayList;

public class BankAccountList {
 private ArrayList<BankAccount> accounts = new ArrayList<>();

  public BankAccountList() {
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Nala", 3000, "lion"));
    accounts.add(new BankAccount("Timon", 32, "meerkat"));
    accounts.add(new BankAccount("Pumba", 50, "warthog"));
    accounts.add(new BankAccount("Zazu", 800, "red-billed hornbill"));
  }

  public ArrayList<BankAccount> getAccounts() {
    return accounts;
  }
  public void add (BankAccount bankAccount) {
    accounts.add(bankAccount);
  }
}
