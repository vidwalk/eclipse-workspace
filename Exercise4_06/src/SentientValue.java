import java.util.Scanner;

public class SentientValue
{
   public static void main(String[] args)
   {
      System.out.println("Please input values and when you've ended inputting enter -1 ");
      Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();
      
      while(number != -1)
      {
         System.out.println("Enter another number: ");
         number = scan.nextInt();
      }
   }
}
