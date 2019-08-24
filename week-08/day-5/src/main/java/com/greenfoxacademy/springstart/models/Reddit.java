package com.greenfoxacademy.springstart.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reddit {
  @Id
  @GeneratedValue
  private long id;
  private String title;
  private int vote;
  private String url;

  public Reddit(String title, String url) {
    this.title = title;
    this.url = url;
    this.vote = 0;
  }

  public Reddit() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getVote() {
    return vote;
  }

  public void setVote(int vote) {
    this.vote = vote;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
