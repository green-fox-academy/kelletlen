package Sum;

import java.util.ArrayList;

public class Sum {
  public int sum ( ArrayList<Integer> numbers) {
    int sum = 0;
    for (int i : numbers) {
      sum += i;
    }
    return sum;
  }
}
