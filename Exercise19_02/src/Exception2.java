import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int number = 0;
      int sum = 0;
      boolean ok = true;
      while (ok)
      {

         try
         {
            number = scan.nextInt();
           sum = sum + number;
         }
         catch (InputMismatchException ime)
         {
            if(scan.hasNext("end"))
               ok = false;
            if(ok == true)
            System.out.println("The input is not an integer, try again");
            scan.nextLine();
         }
      }
      System.out.println("The sum is: " + sum);
   }
}
