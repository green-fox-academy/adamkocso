package com.greenfoxacademy.springstart.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActionsList {
  private List<String> actionlist = new ArrayList<>();


  public void addAction(String action){
    actionlist.add(action);
  }

  public List<String> getActionlist() {
    return actionlist;
  }

  public void setActionlist(List<String> actionlist) {
    this.actionlist = actionlist;
  }
}
