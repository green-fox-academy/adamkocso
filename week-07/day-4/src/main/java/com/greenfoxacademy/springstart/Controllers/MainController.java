package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String renderingMainPage(@RequestParam(value = "name", required = false) String name, Model model){
    if(name == null){
      return "redirect:/login";
    }
    model.addAttribute("name", name);
    return "index";
  }

  @GetMapping("/login")
  public String renderingLoginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String setFoxName(@RequestParam("name") String name){
    return "redirect:/?name=" + name;
  }

}
