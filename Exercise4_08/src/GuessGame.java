import java.util.Random;
import java.util.Scanner;

public class GuessGame
{
   Random random = new Random();
   int target = random.nextInt(1000) + 1;
   int number = 1;

   public boolean RightGuess(int a)
   {
      if (a == target)
      {
         System.out
               .println("Good job! You guessed right in " + number + " tries!");
         return false; // Stop the while
      }
      System.out.println("Try again to guess");
      return true; // continue searching

   }

   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please guess a number between 1 and 1000");
      GuessGame game = new GuessGame();
      int guess = scan.nextInt();
      /* System.out.println(game.target); the number we need to guess */
      while (game.RightGuess(guess))
      {
         guess = scan.nextInt();
         game.number++;
      }
      scan.close();
   }
}
