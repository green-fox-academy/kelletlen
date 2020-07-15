package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
  private Anagram anagram1 = new Anagram();

  @Test
  public void testAnagramTrue () {
    assertTrue(anagram1.isAnagram("listen", "silent"));
  }

  @Test
  public void testAnagramFalseNotSameLength () {
    assertFalse(anagram1.isAnagram("listen", "loud"));
  }

  @Test
  public void testAnagramFalseSameLength () {
    assertFalse(anagram1.isAnagram("listen", "louder"));
  }

}