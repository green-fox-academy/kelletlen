package reservations;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Reservation implements Reservationy {
  String code;
  String dow;

  public Reservation() {
    this.code = getCodeBooking();
    this.dow = getDowBooking();
  }

  @Override
  public String getDowBooking() {
    ArrayList<String> dows = new ArrayList<>();
    dows.add("MON");
    dows.add("TUE");
    dows.add("WED");
    dows.add("THU");
    dows.add("FRI");
    dows.add("SAT");
    dows.add("SUN");
    int random = (int) (Math.random() * 6);
    return dows.get(random);
  }

  @Override
  public String getCodeBooking() {
    String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    SecureRandom rnd = new SecureRandom();
    int length = 8;
    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      sb.append(characters.charAt(rnd.nextInt(characters.length())));
    }
    return sb.toString();
  }
  public String getReservation () {
    return "Booking# " + this.code + " for " + this.dow;
  }
}
