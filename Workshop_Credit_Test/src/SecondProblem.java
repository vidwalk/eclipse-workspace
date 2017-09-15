import java.util.Scanner;

public class SecondProblem
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] number = new int[100];
      System.out.println("Enter the next number: ");
      int n = scan.nextInt();
      int counter = 0;
      number[0] = n;
      while (n != 0)
      {
         System.out.println("Enter the next number: ");
         n = scan.nextInt();
         if (n != 0)
         {
            counter++;
            number[counter] = n;
         }
      }
      for (int i = 0; i <= counter; i++)
      {
         for (int j = 0; j <= counter; j++)
         {
            System.out.print((number[j] - number[i]) + " ");
         }
         System.out.println();
      }
      scan.close();
   }
}
