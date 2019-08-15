package com.greenfoxacademy.springstart.Models;

import org.springframework.stereotype.Service;

@Service
public class FoxFinder {

  
  public Fox foxFinder(Foxes foxes, String name){
    for (Fox fox: foxes.getFoxes()) {
      if(fox.getName().equals(name)) {
        return fox;
        }
      }
    return null;
    }
  }

