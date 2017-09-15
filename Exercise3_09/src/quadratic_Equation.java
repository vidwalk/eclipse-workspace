import java.util.Scanner;

public class quadratic_Equation
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int a = scan.nextInt();
      int b = scan.nextInt();
      int c = scan.nextInt();
      double D = Math.pow(b, 2) - 4 * a * c;
      if (D < 0)
      {
         System.out.println("The equation has no solutions");
      }
      else if (D == 0)
      {
         System.out.println(-b / (2 * a));
      }
      else if (D > 0)
      {
         System.out.println((-b + Math.sqrt(D)) / (2 * a));
         System.out.println((-b - Math.sqrt(D)) / (2 * a));
      }
      scan.close();
   }
}
