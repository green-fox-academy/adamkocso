package com.greenfoxacademy.springstart.Services;

import com.greenfoxacademy.springstart.Models.Fox;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrickListFilter {

  public List<String> trickListFilter(TricksStorage tricks, Fox fox){
    List<String> availableTricks = tricks.getTricks();
    for (int i = 0; i < availableTricks.size(); i++) {
      for (int j = 0; j < fox.getTricks().size(); j++) {
        if(availableTricks.get(i).contains(fox.getTricks().get(j))){
          availableTricks.remove(i);
        }
      }
    }
    return availableTricks;
  }
}
