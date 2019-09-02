package com.greenfoxacademy.springstart.repositories;

import com.greenfoxacademy.springstart.models.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepo extends CrudRepository<Assignee, Long> {
  List<Assignee> findAll();
}
