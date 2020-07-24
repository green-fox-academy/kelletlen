public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int secondsOfADay = 24 * 60 * 60;
    int secondsGone = (14 * 60 * 60) + (34 * 60) + 42;

    int remainingSeconds = secondsOfADay - secondsGone;

    System.out.println(remainingSeconds);
  }
}
