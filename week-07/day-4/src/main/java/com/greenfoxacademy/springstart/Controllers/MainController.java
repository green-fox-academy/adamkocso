package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.*;
import com.greenfoxacademy.springstart.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MainController {

  Foxes foxes;
  Food foods;
  FoxFinder fox;
  Drink drinks;
  TricksStorage tricks;
  TrickListFilter filteredTricks;
  ActionsList actionsList;

  @Autowired
  public MainController(Foxes foxes, Food foods, FoxFinder fox, Drink drinks, TricksStorage tricks, TrickListFilter filteredTricks, ActionsList actionsList) {
    this.foxes = foxes;
    this.foods = foods;
    this.fox = fox;
    this.drinks = drinks;
    this.tricks = tricks;
    this.filteredTricks = filteredTricks;
    this.actionsList = actionsList;
  }

  @GetMapping("/")
  public String renderingMainPage(@RequestParam(value = "name", required = false) String name, Model model){
    if(name == null || name.equals("")){
      return "redirect:/login";
    }
        model.addAttribute("fox", fox.foxFinder(foxes, name));

    return "index";
  }

  @GetMapping("/login")
  public String renderingLoginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String setFoxName(@RequestParam("name") String name){
    foxes.addFox(new Fox(name));
    return "redirect:/?name=" + name;
  }


  @GetMapping("/nutritionStore")
  public String renderingNutritionStore (@RequestParam(value = "name", required = false) String name, Model model){
    model.addAttribute("foods", foods);
    model.addAttribute("drinks", drinks);
    model.addAttribute("fox", fox.foxFinder(foxes, name));
    return "nutritionStore";
  }

  @PostMapping("/nutritionStore")
  public String setFoodAndDrink(@ModelAttribute Fox currentFox){
    fox.foxFinder(foxes, currentFox.getName()).setDrink(currentFox.getDrink());
    fox.foxFinder(foxes, currentFox.getName()).setFood(currentFox.getFood());
    actionsList.addAction(currentFox.getName() + " now eats " + currentFox.getFood());
    actionsList.addAction(currentFox.getName() + " now drinks " + currentFox.getDrink());
    return "redirect:/?name=" + currentFox.getName();
  }


  @GetMapping("/trickCenter")
  public String renderingAvailableTrickList (@RequestParam(value = "name", required = false) String name, Model model){
    model.addAttribute("availableTricks", filteredTricks.trickListFilter(tricks, fox.foxFinder(foxes, name)));
    model.addAttribute("fox", fox.foxFinder(foxes, name));

    return "trickCenter";
  }

  @PostMapping("/trickCenter")
  public String learnNewTrick(@RequestParam(value = "name", required = false) String name,
                              @RequestParam("learnedTrick") String trick){
    fox.foxFinder(foxes, name).addTricks(trick);
    actionsList.addAction(name + " learned a new trick: " + trick);

    return "redirect:/trickCenter?name=" + name;
  }

  @GetMapping("/actionHistory")
  public String listActions(Model model, @RequestParam(value = "name", required = false) String name){
    List<String> personalActionsList = actionsList.getActionlist().stream()
            .filter(x -> x.contains(name))
            .collect(Collectors.toList());

    model.addAttribute("actions", personalActionsList);
    model.addAttribute("name", name);
    return "actionHistory";
  }


}
