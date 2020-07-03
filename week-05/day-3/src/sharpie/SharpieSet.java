package sharpie;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  private ArrayList <Sharpie> SharpieSet;

  public SharpieSet() {

    SharpieSet = new ArrayList<>();
  }
  public void add (Sharpie sharpie) {
    SharpieSet.add(sharpie);
  }

  public int countUsable() {
    int counter = 0;
    for (int i = 0; i < SharpieSet.size(); i++) {
      if (SharpieSet.get(i).getInkAmount() > 0) {
        counter += 1;
      }
    }
    return counter;
  }
  public void removeTrash() {
    for (int i = 0; i < SharpieSet.size() ; i++) {
      if (SharpieSet.get(i).getInkAmount() == 0) {
        SharpieSet.remove(SharpieSet.get(i));
      }
    }
  }
  public int getSharpieSetSize() {
    return SharpieSet.size();
  }
  public void getSharpies() {
    for (int i = 0; i < SharpieSet.size(); i++) {
      System.out.println(SharpieSet.get(i));
    }
  }
}
