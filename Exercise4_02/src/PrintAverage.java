import java.util.Scanner;

public class PrintAverage
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      double sum = 0, i = 0;
      double average = 0;
      for(i = 0; i < 5; i++)
      {
         int value = scan.nextInt();
         sum += value;
      }
      average = sum/i;
      System.out.println(average);
   }
}
