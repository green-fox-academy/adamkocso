package com.rest.rest.models;

import java.util.Arrays;

public class ArraysEx {

  private String what;
  private int[] numbers;

  public ArraysEx() {
  }

  public String getWhat() {
    return what;
  }

  @Override
  public String toString() {
    return "{" +
            "what='" + what + '\'' +
            ", numbers=" + Arrays.toString(numbers) +
            '}';
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
