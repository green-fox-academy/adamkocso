package com.greenfoxacademy.springstart.repositories;

import com.greenfoxacademy.springstart.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDone(boolean isActive);
}
