package com.hello.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Fruit")
public class Fruit {
  @Id
  private String id;
  private String name;
  private String color;

  protected Fruit() {

  }

  public Fruit(final String name, final String color) {
    this.name = name;
    this.color = color;
  }

  public String getId() {
    return id;
  }

  public void setId(final String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }
}
