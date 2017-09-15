import java.util.Scanner;
import java.util.Arrays;

public class Tic_Tac_Toe

{
   public char[][] board;
   public char currentMark;
   
   public Tic_Tac_Toe()
   {
      board = new char[3][3];
      currentMark = 'X';
      startBoard();
   }
   
   public void startBoard()
   {
      for(int i = 0 ; i < 3 ; i++ ) {
         for(int j =0 ; j < 3 ; j++ ) {
         board[i][j]=' ';
         }
         }
   }
   
   public void printBoard()
   { int k=0;
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             System.out.print(board[i][j] + " | ");
             
         }k++;
         System.out.println();
         if(k<3)
         System.out.println("-----------");
     }
   }
   
   public boolean itsFilled()
   {
      boolean itsFilled = true;
      
      for(int i = 0 ; i < 3 ; i++) {
         for(int j = 0 ; j < 3 ; j++) {
            if(board[i][j] == ' ') {
               itsFilled = false;
            }
         }
      }
       return itsFilled;
   }
       public boolean checkForWin() {
          return (checkRowWin() || checkColumnWin() || checkDiagonalWin() );
       }
       
       public boolean checkRowWin() {
          for(int i = 0 ; i < 3 ; i++) {
             if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
                return true;
       }
          }
         return false;
   }
       
   public boolean checkColumnWin()
   {
      for(int i = 0 ; i < 3 ; i++) { 
         if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) 
            return true;
      }
      return false;
      }
   
   
   public boolean checkDiagonalWin()
   {
      return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
   }
   
   public boolean checkRowCol(char c1, char c2, char c3) {
      return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
   }
   
   public void changePlayer() {
      if(currentMark == 'X') {
         currentMark = 'O';
      }  
      else {
         currentMark = 'X';
      }
   }
   public boolean placeMark(int row, int col) {
      if ((row >= 0) && (row < 3)) {
         if((col >= 0) && (col < 3)) {
            if(board[row][col] == ' ') {
               board[row][col] = currentMark;
               return true;
            }
         }
      }
      return false;
   }
   public static void main(String[] array) {
      Scanner scan = new Scanner(System.in);
      boolean ok = true;
      Tic_Tac_Toe game= new Tic_Tac_Toe();
      while(ok) {
      int x = scan.nextInt();
      int y = scan.nextInt();
      
      game.placeMark(x, y);
      game.printBoard();
      if(game.checkForWin()) {
         System.out.println("We have a winner! Congrats!");
      System.exit(0);
      }
      else if(game.itsFilled()) {
         System.out.println("Appears we have a draw!");
         System.exit(0);
      }
      game.changePlayer();
      }
   }
}
