import java.util.Scanner;

public class InputValidation
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number between 10 and 25: ");
      int number = scan.nextInt();
      while(number < 10 || number > 25)
      {
         System.out.println("Please enter a number again! (The number must be between 10 and 25) ");
         number = scan.nextInt();
      }
   }
}
