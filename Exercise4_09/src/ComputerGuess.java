import java.util.Random;
import java.util.Scanner;

public class ComputerGuess
{
   Random random = new Random();
   Scanner scan = new Scanner(System.in);
   int userInput = scan.nextInt();
   int number = 1;
   int upperBound = 1024, p = 1;
   public boolean RightGuess(int a)
   {
      if (a == userInput)
      {
         System.out.println("The pc guess right in " + number + " tries");
         return false;
      }
      else
      {
         number++;
         System.out.println(a);
         System.out.println("Tell the pc if it was too high or too low( 1 for low and 2 for high) ");
         return true;

      }

   }

   public static void main(String[] args)
   {  System.out.println("Please input a number between 1 and 1024");
      ComputerGuess game = new ComputerGuess();
      System.out.println(game.userInput);
      int guess = game.random.nextInt(game.upperBound) + game.p;
      while(game.RightGuess(guess))
      {
        
        if(guess < game.userInput)
        {
           game.p = guess;
        }
        else if(guess > game.userInput)
        {
           game.upperBound = guess;
        }
        guess = game.random.nextInt(game.upperBound - game.p) + game.p; // get it between an interval
      }
      
   }
   
}
