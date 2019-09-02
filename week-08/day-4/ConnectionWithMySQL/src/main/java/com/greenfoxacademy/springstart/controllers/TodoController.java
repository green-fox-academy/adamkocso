package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Assignee;
import com.greenfoxacademy.springstart.models.Todo;
import com.greenfoxacademy.springstart.repositories.AssigneeRepo;
import com.greenfoxacademy.springstart.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;
  AssigneeRepo assigneeRepo;

  @Autowired
  public TodoController(TodoRepository todoRepository, AssigneeRepo assigneeRepo) {
    this.todoRepository = todoRepository;
    this.assigneeRepo = assigneeRepo;
  }




  @GetMapping("/list")
  public String list(Model model){
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }

  @GetMapping("/")
  public String filter(Model model, @RequestParam(value = "isActive", required = false)boolean status){
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

  @GetMapping("/{id}/delete")
  public String deleting(@PathVariable("id") long id){
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String renderingEdit(@PathVariable("id") long id, Model model){
    model.addAttribute("todo", todoRepository.findById(id));
    model.addAttribute("id", id);
    model.addAttribute("assignees", assigneeRepo.findAll());
    return "edittodo";
  }


  @PostMapping("/{id}/edit")
  public String editing(@PathVariable("id") long id, @ModelAttribute Todo editedTodo){
    todoRepository.save(editedTodo);
    return "redirect:/todo/list";
  }

  @PostMapping("/list")
  public String searchBar(Model model, @RequestParam(name = "search", required = false) String search){
    model.addAttribute("todos", todoRepository.findAllByTitle(search));
    return "todolist";
  }

  @GetMapping("/assignees")
  public String listAssignees(Model model){
    model.addAttribute("assignees", assigneeRepo.findAll());
    model.addAttribute("assignee", new Assignee());
    return "assignees";
  }

  @PostMapping("/assignees")
  public String addAssignee(@ModelAttribute Assignee newAssignee){
    if (newAssignee.getName() != null
            && newAssignee.getName() != ""
            && newAssignee.getEmail().indexOf('@') > 0
            && newAssignee.getEmail().indexOf('.', newAssignee.getEmail().indexOf('@')) >= newAssignee.getEmail().indexOf('@') +1
            && newAssignee.getEmail().indexOf('.') != newAssignee.getEmail().length() - 1) {
      assigneeRepo.save(newAssignee);
    }

    return "redirect:/todo/assignees";
  }


  @GetMapping("/assignee/{id}/delete")
  public String deletingAssignee(@PathVariable("id") long id){
    assigneeRepo.deleteById(id);
    return "redirect:/todo/assignees";
  }


  @GetMapping("/assignee/{id}/edit")
  public String renderingEditAssignee(@PathVariable("id") long id, Model model){
    model.addAttribute("assignee", assigneeRepo.findById(id));
    model.addAttribute("id", id);
    return "editassignee";
  }

  @PostMapping("/assignee/{id}/edit")
  public String editingAssignee(@PathVariable("id") long id, @ModelAttribute Assignee editAssignee){
    assigneeRepo.save(editAssignee);
    return "redirect:/todo/assignees";
  }

}
