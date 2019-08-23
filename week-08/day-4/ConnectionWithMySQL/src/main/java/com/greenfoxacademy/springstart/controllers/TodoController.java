package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Todo;
import com.greenfoxacademy.springstart.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping("/list")
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @GetMapping("/")
  public String filter(Model model, @RequestParam(value = "isActive", required = false)boolean status){
    List<Todo> filterdList = new ArrayList<>();
    if(status) {
      filterdList = todoRepository.findAll().stream()
              .filter(x -> !x.isDone())
              .collect(Collectors.toList());
    } else {
      filterdList = todoRepository.findAll();
    }

    model.addAttribute("todos", filterdList);
    return "todolist";
  }


}
