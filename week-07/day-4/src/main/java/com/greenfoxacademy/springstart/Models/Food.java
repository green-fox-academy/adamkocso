package com.greenfoxacademy.springstart.Models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Food {
  private List<String> foods = new ArrayList<>();

  public Food() {
    foods.add("pizza");
    foods.add("hamburger");
    foods.add("sushi");
    foods.add("sandwich");
    foods.add("cake");
    foods.add("toltottkaposzta");
  }

  public List<String> getFoods() {
    return foods;
  }

  public void setFoods(List<String> foods) {
    this.foods = foods;
  }
}
