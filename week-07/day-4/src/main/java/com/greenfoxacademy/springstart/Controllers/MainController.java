package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.Fox;
import com.greenfoxacademy.springstart.Models.Foxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  Foxes foxes;

  @Autowired
  public MainController(Foxes foxes) {
    this.foxes = foxes;
  }




  @GetMapping("/")
  public String renderingMainPage(@RequestParam(value = "name", required = false) String name, Model model){
    if(name == null || name.equals("")){
      return "redirect:/login";
    }
    for (Fox fox: foxes.getFoxes()) {
      if(fox.getName().equals(name)){
        model.addAttribute("fox", fox);
      }
    }
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

}
