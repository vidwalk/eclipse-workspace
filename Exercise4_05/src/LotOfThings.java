import java.util.Scanner;

public class LotOfThings
{
   public static void main(String[] args)
   {

      Scanner scan = new Scanner(System.in);
      int numberEx1 = 0, product = 0;
      char answer;

      // 1.

      while (product <= 100)
      {
         numberEx1 = scan.nextInt();
         product = numberEx1 * 10;
      }
      System.out.println();

      // 2.

      do
      {
         System.out.println("Please input two numbers: ");
         int x = scan.nextInt(), y = scan.nextInt();
         int sum = x + y;
         System.out.println(sum);
         System.out.println(
               "Do you want to add some numbers again? (Y for yes, N for no)");
         scan.nextLine();
         String string = scan.nextLine();
         answer = string.charAt(0);
      }
      while (answer == 'Y');
      System.out.println();

      // 3.

      System.out.println(
            "I will display a table of the multiplications of numbers with 5");
      System.out.println("Number    Number x 5");
      System.out.println("--------------------");
      for (int number = 1; number <= 10; number++)
      {
         System.out.println(number + "\t\t" + (number * 5));
      }
      System.out.println();

      // 4.

      for (char i = 'A'; i <= 'K'; i++)
      {
         System.out.print(i);
      }
      System.out.println();

      // 5.

      double fraction;
      double fractionResult = 0;
      for (fraction = 1; fraction <= 30; fraction++)
      {
         fractionResult = fraction / (31 - fraction) + fractionResult;
      }
      System.out.println(fractionResult);
      System.out.println();
   }

}
