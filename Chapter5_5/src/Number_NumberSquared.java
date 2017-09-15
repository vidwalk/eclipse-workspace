import java.util.Scanner;

public class Number_NumberSquared
{
   public static void main(String[] args)
   {
      int number, maxValue, squared;
      Scanner scan = new Scanner(System.in);
      System.out.println("I will display a table of numbers and their squares");
      System.out.println("How high should I go? ");
      maxValue = scan.nextInt();
      System.out.println("Number    Number Squared");
      System.out.println("------------------------");
      for (number = 1; number <= maxValue; number++)
      {  squared = number * number;
         //System.out.println(number + "\t\t" + (number * number));
         System.out.printf("%d\t\t%d\n" , number , squared);
      }
   }
}
