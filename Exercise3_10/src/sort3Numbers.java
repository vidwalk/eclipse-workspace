import java.util.Scanner;

public class sort3Numbers
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      if (a > b && b > c)
      {
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
      }
      else if (a > c && c > b)
      {
         System.out.println(a);
         System.out.println(c);
         System.out.println(b);
      }
      else if (a < b && a > c)
      {
         System.out.println(b);
         System.out.println(a);
         System.out.println(c);
      }
      else if (a < c && c < b)
      {
         System.out.println(b);
         System.out.println(c);
         System.out.println(a);
      }
      else if (a < b && c > b)
      {
         System.out.println(c);
         System.out.println(b);
         System.out.println(a);
      }
      else if (a > b && c > a)
      {
         System.out.println(c);
         System.out.println(a);
         System.out.println(b);
      }
   }
}
