package com.greenfoxacademy.bankofsimba.models;

import java.util.ArrayList;

public class BankAccountList {
 private ArrayList<BankAccount> accounts = new ArrayList<>();

  public BankAccountList() {
    accounts.add(new BankAccount("Simba", 2000, "lion", true, "good"));
    accounts.add(new BankAccount("Nala", 3000, "lion", false, "good"));
    accounts.add(new BankAccount("Timon", 32, "meerkat", false, "good"));
    accounts.add(new BankAccount("Pumba", 50, "warthog", false, "good"));
    accounts.add(new BankAccount("Zazu", 800, "red-billed hornbill", false, "good"));
    accounts.add(new BankAccount("Scar", 500, "lion", false, "bad"));
  }

  public ArrayList<BankAccount> getAccounts() {

    return accounts;
  }
  public void add (BankAccount bankAccount) {

    accounts.add(bankAccount);
  }
}
