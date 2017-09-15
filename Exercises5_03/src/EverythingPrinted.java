import java.util.Scanner;

public class EverythingPrinted
{
   public static void main(String[] args)
   {
      int[] number = new int[5];
      Scanner scan = new Scanner(System.in);
      int min = scan.nextInt();
      int max = min;
      int sum = min;
      for (int i = 1; i < 5; i++)
      {
         number[i] = scan.nextInt();
         if (min > number[i])
            min = number[i];
         if (max < number[i])
            max = number[i];
         sum = sum + number[i];
      }

      System.out.println(sum + " " + (sum / 5) + " " + max + " " + " " + min);
      scan.close();
   }
}
