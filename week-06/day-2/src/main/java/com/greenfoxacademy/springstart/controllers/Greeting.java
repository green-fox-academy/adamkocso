package com.greenfoxacademy.springstart.controllers;

public class Greeting {
  long id;
  String content;
  int greetCoutn = 0;


  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

}
