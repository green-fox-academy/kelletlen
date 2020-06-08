import java.util.Arrays;

public class PersonalFinance {
  public static void main(String[] args) {
    int[] expenses =  new int [] {500, 1000, 1250, 175, 800, 120};

    int sum = 0;

    for (int i = 0; i < expenses.length; i++) {
      sum += expenses[i];

    }
    System.out.println("We spent: " + sum);

    Arrays.sort(expenses);

    int greatestExpense = expenses[expenses.length -1];

    System.out.println("Our greatest expense: " + greatestExpense);


    int cheapest = expenses [0];


    System.out.println("Our cheapest spending was: " + cheapest);

    int average = sum / expenses.length;

    System.out.println("The average amount of our spending was: " + average);

    }
  }

