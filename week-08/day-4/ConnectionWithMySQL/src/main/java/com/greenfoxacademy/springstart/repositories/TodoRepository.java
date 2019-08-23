package com.greenfoxacademy.springstart.repositories;

import com.greenfoxacademy.springstart.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDone(boolean isActive);
}
