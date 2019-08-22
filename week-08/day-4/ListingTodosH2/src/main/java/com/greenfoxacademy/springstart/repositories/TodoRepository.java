package com.greenfoxacademy.springstart.repositories;

import com.greenfoxacademy.springstart.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
