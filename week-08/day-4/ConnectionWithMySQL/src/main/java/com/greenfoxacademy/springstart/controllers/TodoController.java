package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Todo;
import com.greenfoxacademy.springstart.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
      model.addAttribute("todos", todoRepository.findAllByDone(!status));
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }

    return "todolist";
  }



  @GetMapping("/add")
  public String renderAddTodo(Model model){
    model.addAttribute("todo", new Todo());
    return "addtodo";
  }

  @PostMapping("/add")
    public String addTodo(@ModelAttribute Todo newTodo){
    if(newTodo.getTitle() != null && newTodo.getTitle() != ""){
      todoRepository.save(newTodo);
    }
    return "redirect:/todo/list";
  }



}
