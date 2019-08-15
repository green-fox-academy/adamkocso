package com.greenfoxacademy.springstart.Models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class Drink {
  private List<String> drinks = new ArrayList<>();

  public Drink() {
    drinks.add("lemonade");
    drinks.add("banana turmix");
    drinks.add("beer");
    drinks.add("wine");
    drinks.add("cocktail");
    drinks.add("orange juice");

  }

  public List<String> getDrinks() {
    return drinks;
  }

  public void setDrinks(List<String> drinks) {
    this.drinks = drinks;
  }
}
