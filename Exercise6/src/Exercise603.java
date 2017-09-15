import java.util.Scanner;
import java.util.ArrayList;

public class Exercise603
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> positive = new ArrayList<Integer>();
      ArrayList<Integer> negative = new ArrayList<Integer>();
      System.out.println("Please type integers (0 to terminate) ");
      int read = scan.nextInt();
      int counterp = 0, countern = 0;
      int max = 0, min = 90;
      if (read > 0)
      {
         positive.add(read);
         counterp++;
         if (read > max)
            max = read;
         if (read < min)
            min = read;
      }
      else if (read < 0)
      {
         negative.add(read);
         countern++;
         if (read > max)
            max = read;
         if (read < min)
            min = read;
      }

      while (read != 0)
      {
         read = scan.nextInt();
         if (read > 0)
         {
            positive.add(read);
            counterp++;
            if (read > max)
               max = read;
            if (read < min)
               min = read;
         }
         else if (read < 0)
         {
            negative.add(read);
            countern++;
            if (read > max)
               max = read;
            if (read < min)
               min = read;
         }
      }
      System.out.println(counterp + " positive numbers and " + countern
            + " negative. Largest = " + max + " and smallest = " + min);
      scan.close();
   }
}
