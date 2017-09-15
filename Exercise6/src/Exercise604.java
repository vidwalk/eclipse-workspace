import java.util.Scanner;
import java.util.ArrayList;

public class Exercise604
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      int counter = 0;
      int[] initial = new int[11];
      for (int i = 0; i < 10; i++)
      {
         initial[i] = scan.nextInt();
      }

      for (int i = 0; i < 10; i++)
      {
         if (numbers.contains(initial[i]) == false)
         {
            for (int j = 0; j < 10; j++)
            {
               if (initial[i] == initial[j])
               {
                  numbers.add(initial[j]);
                  counter++;
               }
            }
            System.out.println("There are " + counter + " " + initial[i] + "s");
            counter = 0;
         }
      }
      scan.close();
   }
}
