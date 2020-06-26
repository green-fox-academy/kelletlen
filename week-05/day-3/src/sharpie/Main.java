package sharpie;

import java.util.ArrayList;

public class Main {
  public static void main(String [] args ) {
    Sharpie sharpie1 = new Sharpie("yellow", (float) 0.7);
    System.out.println(sharpie1.getInkAmount());
    sharpie1.use();
    System.out.println(sharpie1.getInkAmount());
    Sharpie sharpie2 = new Sharpie("green", (float) 0.8);
    Sharpie sharpie3 = new Sharpie ("pink", (float) 1.1);


    SharpieSet sharpieSet = new SharpieSet();
    sharpieSet.add(sharpie1);
    sharpieSet.add(sharpie2);
    sharpieSet.add(sharpie3);
    System.out.println(sharpieSet.countUsable());

    for (int i = 0; i < 100 ; i++) {
      sharpie2.use();
    }
    System.out.println(sharpie2.getInkAmount());

    sharpieSet.removeTrash();
    sharpieSet.getSharpies();

    }

    } //nem sikerül felsorolnom a Sharpiekat, csak a memóriahelyüket nyomtatja ki




