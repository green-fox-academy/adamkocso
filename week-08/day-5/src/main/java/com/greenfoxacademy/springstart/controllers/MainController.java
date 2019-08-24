package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Reddit;
import com.greenfoxacademy.springstart.repositories.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  RedditRepository redditRepository;

  @Autowired
  public MainController(RedditRepository redditRepository) {
    this.redditRepository = redditRepository;
    redditRepository.save(new Reddit("Welcome here", "#"));
  }


  @GetMapping("/")
  public String homePage(Model model){
    model.addAttribute("posts", redditRepository.findAll());
    return "main";
  }


  @GetMapping("/submit")
  public String renderingSubmit(Model model){
    model.addAttribute("reddit", new Reddit());
    return "submit";
  }

  @PostMapping("/submit")
  public String submitPost(@ModelAttribute Reddit newPost){
    redditRepository.save(newPost);
    return "redirect:/";
  }




}
