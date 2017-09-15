import java.util.ArrayList;
import java.util.Scanner;

public class Exercise601
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of numbers: ");
      int n = scan.nextInt();
      int max = 0;
      int save = 0;
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      if (n > 0)
      {
         for (int i = 0; i < n; i++)
         {
            System.out.println("Enter a number: ");
            numbers.add(scan.nextInt());
            if (numbers.get(i) > max)
            {
               max = numbers.get(i);
               save = i;
            }
         }

         System.out.println("The numbers: ");
         for (int number : numbers)
         {
            System.out.println(number);
         }
         System.out.println("The position of the largest element and the element");
         System.out.println(save + " " + max);
      }
      else
      {
         System.out.println("The array is empty");
      }
      scan.close();
   }
}
