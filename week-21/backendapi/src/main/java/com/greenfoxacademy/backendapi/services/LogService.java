package com.greenfoxacademy.backendapi.services;

import com.greenfoxacademy.backendapi.models.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
  final
  LogRepository logRepository;

  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }
  public Log save (Log entity) {
    return logRepository.save(entity);
  }
  public List<Log> findAll() {
    return logRepository.findAll();
  }
}
