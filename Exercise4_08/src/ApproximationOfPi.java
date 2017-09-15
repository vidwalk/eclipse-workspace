
public class ApproximationOfPi
{
   public static void main(String[] args)
   {
      double pi = 4, p = 1;

      for (int i = 1; i <= 500; i++)
      {
         p += 2;
         if ((i % 2) == 1)
            pi = pi - (4 / p);
         else
            pi = pi + (4 / p);
      }
      System.out.println(pi);
   }
}
