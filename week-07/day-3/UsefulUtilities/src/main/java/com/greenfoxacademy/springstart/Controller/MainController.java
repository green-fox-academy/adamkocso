package com.greenfoxacademy.springstart.Controller;

import com.greenfoxacademy.springstart.Service.Cesar;
import com.greenfoxacademy.springstart.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  UtilityService utility;
  Cesar coder;

  @Autowired
  public MainController(UtilityService utility, Cesar coder) {
    this.utility = utility;
    this.coder = coder;
  }

  @GetMapping("/useful")
  public String mainPage(){
    return "index";
  }

  @RequestMapping("/useful/colored")
  public String coloredPage(Model model){
    model.addAttribute("color", utility.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String emailValidator(){
    return "emailvalidator";
  }

  @PostMapping("/useful/email")
  public String emailValidator(Model model, @RequestParam("email") String email){
    model.addAttribute("valid", utility.validateEmail(email));
    model.addAttribute("email", email);

    return "emailvalidator";
  }

  @GetMapping("/useful/cesar")
  public String cesarCoder(){
    return "cesar";
  }

  @PostMapping("/useful/cesar")
  public String cesarCode(Model model, @RequestParam("message")String message, @RequestParam("number") int number) {
    model.addAttribute("message", coder.caesar(message, number));
    return "cesar";
  }



}
