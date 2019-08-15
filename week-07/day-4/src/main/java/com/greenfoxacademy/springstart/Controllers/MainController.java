package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  Foxes foxes;
  Food foods;
  FoxFinder fox;
  Drink drinks;

  @Autowired
  public MainController(Foxes foxes, Food foods, FoxFinder fox, Drink drinks) {
    this.foxes = foxes;
    this.foods = foods;
    this.fox = fox;
    this.drinks = drinks;
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
// ez még nem működik
  @PostMapping("/nutritionStore")
  public String setFoodAndDrink(@ModelAttribute Fox fox){
    return "redirect:/?name=Karak";
  }



}
