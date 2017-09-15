import java.util.Scanner;
import java.util.Random;

public class NimGame
{
   public int[][] board;
   public int[] boardnr, boardnr2;
   public char currentMark;
   public Random random = new Random();
   public int st;
   public int nr;

   public NimGame()
   {
      board = new int[10][5];
      boardnr = new int[10];
      boardnr2 = new int[10];
      startBoard();
      currentMark = 'X';
   }

   public void startBoard()
   {
      st = random.nextInt(10);
      nr = st;
      for (int i = 0; i < st; i++)
      {
         int p = random.nextInt(5);
         boardnr2[i] = boardnr[i] = p;

         for (int j = 0; j < p; j++)
            System.out.print('|');
         System.out.println();

      }

   }

   public void changePlayer()
   {
      if (currentMark == 'X')
      {
         currentMark = 'O';
      }
      else
      {
         currentMark = 'X';
      }
   }

   public boolean remove(int piles, int sticks)
   {
      if ((piles >= 0) && (piles < 10))
      {
         if ((sticks >= 1) && (sticks <= boardnr[piles]))
         {
            if ((boardnr[piles] - sticks) >= 0)
            {
               boardnr[piles] = boardnr[piles] - sticks;
               return true;
            }
         }
      }
      return false;
   }

   public void printBoard()
   {
      for (int i = 0; i < nr; i++)
      {
         for (int j = 0; j < boardnr[i]; j++)
         {
            System.out.print('|');
         }
         System.out.println();
      }
   }

   public boolean checkWin()
   {
      for (int i = 0; i < nr; i++)
      {
         if (boardnr[i] > 0)
            return false;
      }
      return true;

   }

   public boolean checkPlayer()
   {
      if (currentMark == 'X')
      {
         return true;
      }
      return false;
   }

   public static void main(String[] args)
   {
      boolean playAgain = true;
      boolean ok = true;
      boolean newGame = true;
      NimGame game = new NimGame();
      Scanner scan = new Scanner(System.in);
      while (playAgain)
      {

         while (ok)
         {
            if (game.checkPlayer())
            {
               System.out.println("Player 1, Choose a pile.");
               int x = scan.nextInt();
               int y = scan.nextInt();
               game.remove(x, y); // remove the sticks
               game.printBoard(); // print the board
               if (game.checkWin())
               {
                  System.out.println("Player 2 wins");
                  ok = false;
               }

            }
            else
            {
               System.out.println("Player 2, Choose a pile.");
               int x = scan.nextInt();
               int y = scan.nextInt();
               game.remove(x, y);
               game.printBoard();
               if (game.checkWin())
               {
                  System.out.println("Player 1 wins");
                  ok = false;
               }

            }
            game.changePlayer();
            if (ok == false)
            {
               System.out.println(
                     "Do you want to play again?(true for yes, false for no) ");
               playAgain = scan.nextBoolean();
               if (playAgain)
               {
                  ok = true;
                  System.out.println(
                        "Do you want a new start?(true for yes, false for no)");
                  newGame = scan.nextBoolean();
                  if (newGame)
                  {
                     game.startBoard();
                  }
                  else
                  {
                     for (int i = 0; i < game.nr; i++)
                     {
                        game.boardnr[i] = game.boardnr2[i];
                        for (int j = 0; j < game.boardnr[i]; j++)
                           System.out.print('|');
                        System.out.println();
                     }
                  }
               }
            }
         }
      }
      scan.close();
   }
}
