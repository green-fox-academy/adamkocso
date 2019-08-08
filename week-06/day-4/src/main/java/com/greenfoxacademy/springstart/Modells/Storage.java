package com.greenfoxacademy.springstart.Modells;

import java.util.ArrayList;
import java.util.List;

public class Storage {
  List<ShopItem> storage;

  public Storage() {
    storage = new ArrayList<>();
  }

  public void addToList(ShopItem shopItem){
    storage.add(shopItem);
  }

  public List<ShopItem> getStorage() {
    return storage;
  }
}
