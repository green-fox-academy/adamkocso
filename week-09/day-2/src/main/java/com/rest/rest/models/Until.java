package com.rest.rest.models;

public class Until {

  private int until;

  public Until() {
  }

  @Override
  public String toString() {
    return "{" +
            "until=" + until +
            '}';
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }
}
