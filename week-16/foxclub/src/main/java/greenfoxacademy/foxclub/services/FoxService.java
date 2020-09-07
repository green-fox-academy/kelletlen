package greenfoxacademy.foxclub.services;

import greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {
  ArrayList<Fox> foxes = new ArrayList<>();

  public Fox getFox(String name) {
    return foxes.stream()
        .filter(fox -> fox.getName().equalsIgnoreCase(name))
        .findFirst()
        .orElse(null);
  }
  public void addFox(Fox fox) {
    foxes.add(fox);
  }
}
