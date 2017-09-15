/**
 * This program demonstrates the while loop.
 */

public class WhileLoop
{
   public static void main(String[] args)
   {
      int number = 1;

      while (number <= 5) // b) there would be only 4 hello's printed because the purpose
      {                   // is to count how many times we printed hello
         System.out.println("Hello");
         number++;
      }

      System.out.println("That's all");

   }
}
