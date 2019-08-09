package com.greenfoxacademy.springstart.Modells;



public class ShopItem {
  String name;
  String type;
  String description;
  double price;
  int quantityOfStock;


  public ShopItem(String name, String type, String description, double price, int quantityOfStock) {
    this.name = name;
    this.type = type;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }


  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public String getType() {
    return type;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
