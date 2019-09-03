package com.rest.rest.repositories;

import com.rest.rest.models.Log;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogRepo extends CrudRepository<Log, Integer> {
  List<Log> findAll();
}
