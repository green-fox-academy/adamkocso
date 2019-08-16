package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Foxes {
  private List<Fox> foxes;

  public Foxes() {
    foxes = new ArrayList<>();
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }

  public void addFox(Fox fox){
    foxes.add(fox);
  }
}
