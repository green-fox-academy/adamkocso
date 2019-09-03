package com.rest.rest.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
public class Log {

  @Id
  @GeneratedValue
  private int id;
  @JsonIgnore
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;
  private String endpoint;
  private String data;


  public Log() {
  }

  public Log(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
    this.createdAt = new Date();
  }

  public Log(String endpoint) {
    this.endpoint = endpoint;
    this.data = "-";
    this.createdAt = new Date();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
