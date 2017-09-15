import java.util.Scanner;

public class LoopsForNumbers
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int i = 1;
      for( i = 1 ; i <= n; i++)
         System.out.print(i + ", ");
      
      System.out.println();
      
      for( i = 1 ; i <= n; i++)
         System.out.print(i*2 + ", ");
      
      System.out.println();
      
      for( i = 1 ; i <= n; i++ )
         System.out.print( (i*i) + ", ");
   }
}
