package com.greenfoxacademy.springstart.Models;

public class BankAccount {
  String name;
  int balance;
  String animalType;
  String status;

  public BankAccount(String name, int balance, String animalType, String status) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}
