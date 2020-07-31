package countletters;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

  CountLetters cl;

  @Before
  public void setup() {
    cl = new CountLetters();
  }

  @Test
  public void countLetters() {
    HashMap <Character, Integer> hashmap1 = new HashMap<>();
    hashmap1.put('c', 2);
    hashmap1.put('i', 1);
    hashmap1.put('a', 1);
    HashMap<Character, Integer> hashmap2 = cl.countLetters("Cica.");
    assertTrue(hashmap1.equals(hashmap2));
  }
}