package com.greenfoxacademy.backendapi.models;

import java.util.List;

public class LogEntries {
  List<Log> entries;
  int entry_count;

  public LogEntries(List<Log> entries, int entry_count) {
    this.entries = entries;
    this.entry_count = entry_count;
  }

  public LogEntries() {
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }

  public void increaseEntryCount() {
    entry_count += 1;
  }
}
