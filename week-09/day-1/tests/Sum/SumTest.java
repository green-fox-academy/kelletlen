package Sum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
  private Sum sum = new Sum();

  @Test
  public void testSumOfEmptyArrayIs0() {
    ArrayList<Integer> numbers = new ArrayList();
    int result = sum.sum(numbers);
    assertEquals(0, result);
  }

  @Test
  public void testSumOfArrayWithOneElementIsTheElement() {
    ArrayList<Integer> numbers = new ArrayList();
    numbers.add(1);
    int result = sum.sum(numbers);
    assertEquals(1, result);
  }

  @Test
  public void testSumofArrayWithMultipleElements() {
    ArrayList<Integer> numbers = new ArrayList();
    numbers.add(1);
    numbers.add(2);
    int result = sum.sum(numbers);
    assertEquals(3, result);
  }

  @Test
  public void testSumofArrayWithNull() {
    ArrayList<Integer> numbers = new ArrayList();
    numbers.add(0);
    int result = sum.sum(numbers);
    assertEquals(0, result);
  }
}