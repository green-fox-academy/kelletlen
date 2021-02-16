package com.greenfoxacademy.backendapi.services;

import com.greenfoxacademy.backendapi.models.Log;
import com.greenfoxacademy.backendapi.models.LogEntries;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
  final
  LogRepository logRepository;

  public LogService(LogRepository logRepository) {

    this.logRepository = logRepository;
  }

  public void save(Log entity) {
    logRepository.save(entity);
  }

  public List<Log> findAll() {
    return logRepository.findAll();
  }

  public LogEntries getLogEntries() {
    LogEntries logEntries = new LogEntries();
    logEntries.setEntries(logRepository.findAll());
    logEntries.setEntry_count(logRepository.findAll().size());
    return logEntries;
  }
}
