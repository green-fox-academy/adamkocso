package com.greenfoxacademy.springstart.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TricksStorage {
  private List<String> tricks = new ArrayList<>();

  public TricksStorage() {
    tricks.add("Coding");
    tricks.add("Cooking");
    tricks.add("Fishing");
    tricks.add("Football");
    tricks.add("Reading");
  }

  public List<String> getTricks() {
    List<String> newList = new ArrayList<>(tricks);
    return newList;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }
}
