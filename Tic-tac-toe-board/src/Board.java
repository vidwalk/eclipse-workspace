import java.util.Arrays;

public class Board
{
   public static void main(String[] args)
   {  int x=0;
      char[][] c=new char[3][3];
      c[0][0] = 'O';
      c[1][1] = 'X';
      for (int i = 0; i<3; i++) {
         for (int j = 0; j<3; j++)
           if(c[i][j] == 0)
              c[i][j]=' ';
      }
      for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 3; j++) {
             System.out.print(c[i][j] + " | ");
             
         }x++;
         System.out.println();
         if(x<3)
         System.out.println("-----------");
     }
         }
}
