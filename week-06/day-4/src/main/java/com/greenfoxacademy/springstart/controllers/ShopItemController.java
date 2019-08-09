package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Modells.ShopItem;
import com.greenfoxacademy.springstart.Modells.Storage;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

@Controller
public class ShopItemController {
  Storage list = new Storage();
  ShopItem shopItem1 = new ShopItem("Running shoes", "Clothes and Shoes", "Nike running shoes for every day sport", 1000.0, 5);
  ShopItem shopItem2 = new ShopItem("Printer", "Electronics", "Some HP printer that will print pages", 3000.0, 2);
  ShopItem shopItem3 = new ShopItem("Coca cola", "Beverages and Snacks",
          "0.5l standard coke", 25.0, 0);
  ShopItem shopItem4 = new ShopItem("Wokin", "Beverages and Snacks",
          "Chicken with fried rice and WOKIN sauce", 119.0, 100);
  ShopItem shopItem5 = new ShopItem("T-shirt", "Clothes and Shoes","Blue with a corgi on bike", 300.0, 1);


  public void table(){
    list.addToList(shopItem1);
    list.addToList(shopItem2);
    list.addToList(shopItem3);
    list.addToList(shopItem4);
    list.addToList(shopItem5);

  }

  @GetMapping(value = "/webshop")
  public String tableItems(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> allItems = list.getStorage();
    model.addAttribute("list", allItems);
    return "index";
  }

  @GetMapping(value = "")
  public String main(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> allItems = list.getStorage();
    model.addAttribute("list", allItems);
    return "index";
  }


  @GetMapping("/only-available")
  public String availableItems(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> availableItems = list.getStorage().stream()
            .filter(x -> x.getQuantityOfStock() > 0)
            .collect(Collectors.toList());
    model.addAttribute("list", availableItems);
    return "index";
  }

  @GetMapping("/cheapest-first")
  public String cheapestFirst(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> cheapestItem = list.getStorage().stream()
            .sorted(Comparator.comparingDouble(list -> list.getPrice()))
            .collect(Collectors.toList());
    model.addAttribute("list", cheapestItem);
    return "index";
  }


  @GetMapping("/contains-nike")
  public String containsNike(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> containsNike = list.getStorage().stream()
            .filter(x -> x.getDescription().toLowerCase().contains("nike") || x.getName().toLowerCase().contains("nike"))
            .collect(Collectors.toList());
    model.addAttribute("list", containsNike);
    return "index";
  }

  @GetMapping("/average-stock")
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

  @GetMapping("/most-expensive")
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


  @PostMapping("/search")
  public String search(Model model, @RequestParam("searchtext") String searchText) {
    list.getStorage().clear();
    table();
    List<ShopItem> searchItem = list.getStorage().stream()
            .filter(x -> x.getDescription().toLowerCase().contains(searchText.toLowerCase()) || x.getName().toLowerCase().contains(searchText.toLowerCase()))
            .collect(Collectors.toList());
    model.addAttribute("list", searchItem);
    return "index";
  }


  @GetMapping("/more-filters")
  public String tablefilterItems(Model model){
    list.getStorage().clear();
    table();
    List<ShopItem> allItems = list.getStorage();
    model.addAttribute("list", allItems);
    return "more";
  }


  @RequestMapping("/filter-by-type")
  public String clothesAndShoes(Model model, @RequestParam("filter") String filter){
    list.getStorage().clear();
    table();
    List<ShopItem> clothesFilter = list.getStorage().stream()
            .filter(x -> x.getType().equals(filter.replace('+',' ')))
            .collect(Collectors.toList());
    model.addAttribute("list", clothesFilter);
    return "more";
  }


//  @RequestMapping("/price-in-eur")
//  public String priceInEur(Model model){
//    list.getStorage().clear();
//    table();
//    List<ShopItem> eur = list.getStorage().stream()
//            .peek(x -> x.setPrice(x.getPrice() * 0.0387136))
//            .collect(Collectors.toList());
//    model.addAttribute("list", eur);
//    return "more";
//
//  }


  @PostMapping("/filter-by-price")
  public String priceFilter(Model model, @RequestParam("searchprice") String searchprice,
                            @RequestParam("pricefilter") String pricefilter) {
    list.getStorage().clear();
    table();
    List<ShopItem> searchPrice = new ArrayList<>();

    if(pricefilter.equals("Above")) {
      searchPrice = list.getStorage().stream()
              .filter(x -> x.getPrice() > parseInt(searchprice))
              .collect(Collectors.toList());
    } else if(pricefilter.equals("Below")) {
      searchPrice = list.getStorage().stream()
              .filter(x -> x.getPrice() < parseInt(searchprice))
              .collect(Collectors.toList());
    } else if(pricefilter.equals("Exactly")) {
      searchPrice = list.getStorage().stream()
              .filter(x -> x.getPrice() == parseInt(searchprice))
              .collect(Collectors.toList());
    }
    model.addAttribute("list", searchPrice);
    return "more";
  }

}
