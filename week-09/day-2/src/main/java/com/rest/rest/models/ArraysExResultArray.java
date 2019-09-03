package com.rest.rest.models;

public class ArraysExResultArray {

  private int[] result;

  public ArraysExResultArray() {
  }

  public int[] getResult() {
    return result;
  }

  public void setResult(int[] result) {
    this.result = result;
  }

  public void doubling(int[] numbers){
    int[] newNumbers = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      newNumbers[i] = numbers[i] * 2;
    }
    this.result = newNumbers;
  }
}
