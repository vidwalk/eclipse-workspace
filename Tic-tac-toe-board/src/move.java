import java.util.Scanner;

public class move
{
public static void main(String[] array)
{ int k=0;
   char[][] c=new char[3][3];
   Scanner scan = new Scanner(System.in);
   int x = scan.nextInt();
   int y = scan.nextInt();
   c[x][y]='X';
   
   for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
          System.out.print(c[i][j] + " | ");
          
      }k++;
      System.out.println();
      if(k<3)
      System.out.println("-----------");
  }
}
}
