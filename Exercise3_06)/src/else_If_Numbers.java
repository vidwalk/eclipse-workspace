import java.util.Scanner;

public class else_If_Numbers
{
   public static void main(String[] args)
   {
      int a = 0, b = 0;
      Scanner scan = new Scanner(System.in);
      a = scan.nextInt();
      b = scan.nextInt();
      if (a > b)
      {
         System.out.println(b);
         System.out.println(a);
         System.out.println((a + b));
         if (b != 0)
         {
            System.out.println((a / b));
            System.out.println(a % b);
         }
      }
      else
      {
         System.out.println(a);
         System.out.println(b);
         System.out.println((a + b));
         if (a != 0)
         {
            System.out.println((b / a));
            System.out.println((b % a));
         }
      }

   }
}
