package reservations;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Reservation reservation1 = new Reservation();
    System.out.println(reservation1.getReservation());

    ArrayList<Reservation> reservations = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      reservations.add(new Reservation());
    }
    for (Reservation r : reservations) {
      System.out.println(r.getReservation());
    }
  }
}
