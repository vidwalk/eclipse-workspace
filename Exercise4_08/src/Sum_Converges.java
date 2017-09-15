
public class Sum_Converges
{
   public static void main(String[] args)
   {
      double p = 1, sum1 = 0, sum2 = 0, sum3 = 0;
      for (int i = 0; i <= 5; i++)
      {
         sum1 = sum1 + p;
         p = p * (0.5);
      }

      System.out.println(sum1);
      p = 1;

      for (int i = 0; i <= 25; i++)
      {
         sum2 = sum2 + p;
         p = p * (0.5);
      }

      System.out.println(sum2);
      p = 1;

      for (int i = 0; i <= 100; i++)
      {
         sum3 = sum3 + p;
         p = p * (0.5);
      }
      System.out.println(sum3);
      if (sum1 < sum2 && sum2 < sum3 && sum3 == 2)
      {
         System.out.println("The series converges towards 2 ");
      }
      else
      {
         System.out.println("The series doesn't converge towards 2 ");
      }
   }
}
