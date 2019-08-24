package com.greenfoxacademy.springstart.repositories;

import com.greenfoxacademy.springstart.models.Reddit;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepository extends CrudRepository<Reddit, Long> {
}
