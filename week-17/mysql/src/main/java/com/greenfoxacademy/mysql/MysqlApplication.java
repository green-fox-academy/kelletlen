package com.greenfoxacademy.mysql;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication implements CommandLineRunner {

  final
  TodoRepository todoRepository;

  public MysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(MysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("make the beds", true, true));
    todoRepository.save(new Todo("do the washing up", false, false));
    todoRepository.save(new Todo("clean the bathroom", false, true));
    todoRepository.save(new Todo("tidy up", true, true));
    todoRepository.save(new Todo("mop", true, false));

  }
}
