import java.util.Scanner;

public class SmallestDouble
{
   public static void main(String[] args)
   {
      double[] number = new double[7];
      Scanner scan = new Scanner(System.in);
      double min = scan.nextDouble();

      for (int i = 1; i < 7; i++)
      {
         number[i] = scan.nextDouble();

         if (min > number[i])
            min = number[i];

      }

      System.out.println("The smallest element is: ");
      System.out.println(min);
      scan.close();
   }
}
