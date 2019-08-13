package com.greenfoxacademy.springstart.Controllers;

import com.greenfoxacademy.springstart.Models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

  List<BankAccount> accounts = new ArrayList<>();

  public BankAccountController() {
    accounts.add(new BankAccount("Simba", 2000, "lion", "king"));
    accounts.add(new BankAccount("Timon", 1000, "lion", "servant"));
    accounts.add(new BankAccount("Pumba", 1550, "boar", "servant"));
    accounts.add(new BankAccount("Carf", 866, "lion", "servant"));
    accounts.add(new BankAccount("Vuk", 5000, "fox", "spy"));

  }

  @GetMapping("/show")
  public String showAccount (Model model){
    model.addAttribute("accounts", accounts);
    return "main";
  }
}
