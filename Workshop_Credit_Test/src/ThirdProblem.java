import java.util.Scanner;

public class ThirdProblem
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] number = new int[100];
      System.out.println("How many number? ");
      int nr = scan.nextInt();
      int aux = 0;
      for(int i = 0 ; i < nr; i++)
      {
         System.out.println("Enter the next number: ");
         number[i] = scan.nextInt();
      }
      
      for(int i = 0 ; i <= nr/2  ; i++)
      {
         aux = number[i];
         number[i] = number[nr-i-1];
         number[nr-i-1] = aux;
      }
      for(int i= 0 ; i < nr ; i++)
         System.out.println(number[i]);
      scan.close();
   }
}
