import java.util.*;

public class SolarSystem{
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    // Saturn is missing from the planetList
    // Insert it into the correct position
    // Create a method called putSaturn() which has list parameter and returns the correct list.

    System.out.println(putSaturn2(planetList));
    // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
  }
  public static ArrayList <String> putSaturn(ArrayList <String> list){
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals("Jupiter")) {
        list.add(list.get(i +2));
        list.set(i+2, list.get(i+1));
        list.set(i+1, "Saturn");
      }
    }
    return list;
  }

  public static ArrayList <String> putSaturn2 (ArrayList <String> list) {
    list.add(5, "Saturn");
    return list;
  }
}
