package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Modells.ShopItem;
import com.greenfoxacademy.springstart.Modells.Storage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ShopItemController {
  Storage list = new Storage();
  ShopItem shopItem1 = new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000.0, 5);
  ShopItem shopItem2 = new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2);
  ShopItem shopItem3 = new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0);
  ShopItem shopItem4 = new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100);
  ShopItem shopItem5 = new ShopItem("T-shirt", "Blue with a corgi on bike", 300.0, 1);


  public void table(){
    list.addToList(shopItem1);
    list.addToList(shopItem2);
    list.addToList(shopItem3);
    list.addToList(shopItem4);
    list.addToList(shopItem5);

  }

  @RequestMapping(value = "")
  public String tableItems(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> allItems = list.getStorage();
    model.addAttribute("list", allItems);
    return "index";
  }


  @RequestMapping("/only-available")
  public String availableItems(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> availableItems = list.getStorage().stream()
            .filter(x -> x.getQuantityOfStock() > 0)
            .collect(Collectors.toList());
    model.addAttribute("list", availableItems);
    return "index";
  }

  @RequestMapping("/cheapest-first")
  public String cheapestFirst(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> cheapestItem = list.getStorage().stream()
            .sorted(Comparator.comparingDouble(list -> list.getPrice()))
            .collect(Collectors.toList());
    model.addAttribute("list", cheapestItem);
    return "index";
  }


  @RequestMapping("/contains-nike")
  public String containsNike(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> containsNike = list.getStorage().stream()
            .filter(x -> x.getDescription().toLowerCase().contains("nike") || x.getName().toLowerCase().contains("nike"))
            .collect(Collectors.toList());
    model.addAttribute("list", containsNike);
    return "index";
  }

  @RequestMapping("/average-stock")
  public String averageStock(Model model){
    list.getStorage().clear();
    table();
    double average = list.getStorage().stream()
            .mapToDouble(number -> number.getQuantityOfStock())
            .average()
            .getAsDouble();

    model.addAttribute("average", "Average stock: " + average);
    return "average";
  }

  @RequestMapping("/most-expensive")
  public String mostExpensive(Model model){
    list.getStorage().clear();
    table();
    double max = list.getStorage().stream()
            .mapToDouble(number -> number.getPrice())
            .max()
            .getAsDouble();

    String expensiveItem = list.getStorage().stream()
            .filter(x -> x.getPrice() == max)
            .collect(Collectors.toList())
            .get(0).getName();
    model.addAttribute("average", "The most expensive item: " + expensiveItem);
    return "average";
  }


//  @RequestMapping("/search")
//  public String search(Model model,
//                       @RequestParam("searchtext") String searchText,
//                       @RequestParam("searchbutton") String searchButton) {
//    list.getStorage().clear();
//    table();
//    List<ShopItem> searchItem = list.getStorage().stream()
//            .filter(x -> x.getDescription().toLowerCase().contains(searchText))
//            .collect(Collectors.toList());
//    model.addAttribute("list", searchItem);
//    return "index";
//  }

}
