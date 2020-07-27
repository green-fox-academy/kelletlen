public class UrlFixer {
  public static void main(String[] args) {
    String url = "http//www.reddit.com/r/nevertellmethebots";

    System.out.println(url.replace("bots", "odds").replace("http", "https:"));
  }
}
