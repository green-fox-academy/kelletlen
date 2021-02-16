package greenfoxacademy.foxclub.services;

import greenfoxacademy.foxclub.models.Fox;
import greenfoxacademy.foxclub.repositories.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {

  final
  FoxRepository foxRepository;

  public FoxService(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  public Fox save(Fox fox) {

    return foxRepository.save(fox);
  }

  public Fox findByName(String name) {
    return foxRepository.findByName(name);
  }
}
