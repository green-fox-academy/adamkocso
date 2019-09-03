package com.rest.rest.models;

public class DoUntil {

  private int result;

  public DoUntil() {
  }

  public void sum(int until){
    int sum = 0;
    for (int i = 1; i <= until; i++) {
      sum += i;
    }
    this.result = sum;
  }

  public void factor(int until){
    int factor = 1;
    for (int i = 1; i <= until; i++) {
      factor *= i;
    }
    this.result = factor;
  }


  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
