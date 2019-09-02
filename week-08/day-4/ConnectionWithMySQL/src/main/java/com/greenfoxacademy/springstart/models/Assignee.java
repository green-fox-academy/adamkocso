package com.greenfoxacademy.springstart.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {


  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String email;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "assignee", fetch = FetchType.EAGER)
  List<Todo> todos;


  public Assignee() {
  }

  public Assignee(String name) {
    this.name = name;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
