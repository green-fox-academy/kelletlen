package apples;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

  @Test
  public void getApple() {
    Apple apple1 = new Apple();
    assertEquals("apple", apple1.getApple());
  }
}