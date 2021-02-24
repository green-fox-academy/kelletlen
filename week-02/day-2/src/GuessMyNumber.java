import java.sql.SQLOutput;
import java.util.Scanner;

public class GuessMyNumber {
  /*Write a program where the program chooses a number between 1 and 100. The player is then asked to enter a guess. If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.

Make the range customizable (ask for it before starting the guessing).
You can add lives. (optional)
Example
I've the number between 1-100. You have 5 lives.

> 20
Too high. You have 4 lives left.

> 10
Too low. You have 3 lives left.

> 15
Congratulations. You won!*/
  public static void main(String[] args) {
    int lives = 4;
    System.out.println("I've the number between 1-100. You have 5 lives.");
    int number = (int) (Math.random() * 100) + 1;
    int guess = 0;
    while (guess != number || lives != 0) {
      Scanner scanner = new Scanner(System.in);
      guess = scanner.nextInt();
      System.out.println(guessMachine(number, guess, lives));
      lives -= 1;
    }
  }

  public static String guessMachine(int number, int guess, int lives) {
    if (guess == number) {
      return "Congratulations. You won!";
    } else if (guess < number) {
      if (lives > 0) {
        return "Too low. You have " + lives + " lives left.";
      } else {
        return "Game over! The number was " + number;
      }
    } else {
      if (lives > 0) {
        return "Too high. You have " + lives + " lives left.";
      } else {
        return "Game over!The number was " + number;
      }
    }
  }
}

