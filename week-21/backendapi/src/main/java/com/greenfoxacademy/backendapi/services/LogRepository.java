package com.greenfoxacademy.backendapi.services;

import com.greenfoxacademy.backendapi.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
  List<Log> findAll();
}
