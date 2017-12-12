import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] array = new int[6];
      int i = 0;

      while (i < 5)
      {
         try
         {
            array[i] = scan.nextInt();
            if (array[i] >= 10 && array[i] <= 99)
               i++;
            else
               System.out.println(
                     "The input is not an integer in the range 10-99, try again");
         }
         catch (InputMismatchException ime)
         {
            System.out.println(
                  "The input is not an integer in the range 10-99, try again");
            scan.nextLine();
         }

      }

      System.out.println(array[2]);
   }
}
