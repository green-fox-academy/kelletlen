package greenfoxacademy.foxclub.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ActionService {
  ArrayList<String> actionList = new ArrayList<>();

  public ArrayList<String> getActionList () {
    return actionList;
  }
  public void addToList (String action) {
    actionList.add(action);
  }
}
