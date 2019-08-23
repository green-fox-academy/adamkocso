package com.greenfoxacademy.springstart;

import com.greenfoxacademy.springstart.models.Todo;
import com.greenfoxacademy.springstart.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstartApplication implements CommandLineRunner {

  TodoRepository todoRepository;

  @Autowired
  public SpringstartApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringstartApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    todoRepository.save(new Todo("get sleep", true, false));
////    todoRepository.save(new Todo("practice mysql", true, false));
////    todoRepository.save(new Todo("practice spring", false, false));
////    todoRepository.save(new Todo("buy milk", false, true));
////    todoRepository.save(new Todo("buy bread", false, true));
  }
}
