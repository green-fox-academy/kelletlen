package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
  Fibonacci f;
  @Before
  public void setup () {
    f = new Fibonacci();
  }

  @Test
  public void fibonacciWhenNegative() {
    assertEquals(f.fibonacci(-3), 0);
  }
  @Test
  public void fibonacciWhenZero () {
    assertEquals(f.fibonacci(0), 0);
  }
  @Test
  public void fibonacciWhenPositive() {
    assertEquals(f.fibonacci(5), 5);
  }
}