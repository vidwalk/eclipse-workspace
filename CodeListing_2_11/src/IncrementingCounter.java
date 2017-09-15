public class IncrementingCounter
{
   public static void main(String[] args)
   {
      double a = 0.0;
      for (int i = 0; i < 50; i++)
      {System.out.println(a);
         if (a == 0.5)
         {
            System.out.println("I hit 0.5");
         }
         else if (a == 2.0)
         {
            System.out.println("I hit 2");
         }
         else if (a == 3.0)
         {
            System.out.println("I hit 2");
         }
         else if (a == 4.0)
         {
            System.out.println("I hit 4");
         }
         else if (a == 4.5)
         {
            System.out.println("I hit 4.5");
         }
         a += 0.1;
      }
   }
}
