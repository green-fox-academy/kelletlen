package greenfoxacademy.foxclub.services;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class ActionService {
  ArrayList<String> actionList = new ArrayList<>();
  Date date = new Date();
  SimpleDateFormat formatter = new SimpleDateFormat("yyyy. MMMM dd. HH:mm:ss");

  public ArrayList<String> getActionList() {
    return actionList;
  }

  public void addToList(String action) {
    actionList.add(formatter.format(date) + " : " + action);
  }
}
