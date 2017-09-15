import java.util.Scanner;

public class NumberOfCharactersFromStrings
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String word;
      int sum = 0;

      for (int i = 0; i < 6; i++)
      {
         word = scan.nextLine();
         sum = sum + word.length();
      }
      System.out.println(sum);
   }
}
