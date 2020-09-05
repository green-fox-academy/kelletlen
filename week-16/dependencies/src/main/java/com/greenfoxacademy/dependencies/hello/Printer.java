package com.greenfoxacademy.dependencies.hello;

import com.greenfoxacademy.dependencies.coloring.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

  final
  MyColor color;

  public Printer(MyColor color) {
    this.color = color;
  }

  public void log(String message) {
    System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    color.printColor();
  }
}
