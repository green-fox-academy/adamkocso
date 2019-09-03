package com.rest.rest.models;

public class ArraysExResult {

  private int result;

  public ArraysExResult() {
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public void sum (int[] numbers){
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    this.result = sum;
  }

  public void multiply(int[] numbers){
    int multiply = 1;
    for (int i = 0; i < numbers.length; i++) {
      multiply *= numbers[i];
    }
    this.result = multiply;
  }
}
