import java.util.Scanner;

public class ReadAndPrint
{
   public static void main(String[] args)
   {
      int[] number = new int[10];
      int size = 10;
      Scanner scan = new Scanner(System.in);

      for (int i = 0; i < 10; i++)
         number[i] = scan.nextInt();

      for (int i = size - 1; i >= 0; i--)
         System.out.println(number[i] + " ");
      scan.close();
   }
}
