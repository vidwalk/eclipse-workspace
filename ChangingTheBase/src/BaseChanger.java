import java.util.Scanner;

public class BaseChanger
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Input a number you want to convert:");
      int userInput = scan.nextInt();
      int aux = userInput, counter = 0;
      char[] baseChar = new char[20];
      System.out.println("Input the base you want to change it in");
      int base = scan.nextInt();

      while (userInput != 0)
      {
         aux = userInput % base;
         if (aux <= 9)
         {
            baseChar[counter] = (char) (aux + 48);
            counter++;
         }
         else
         {
            baseChar[counter] = (char) (aux + 55);
            counter++;
         }
         userInput = userInput / base;

      }

      System.out.println("This is the result: ");

      for (int i = counter - 1; i >= 0; i--)
      {
         System.out.print(baseChar[i]);
      }

      scan.close();
   }

}
