import java.util.Scanner;

public class ComparingArrays
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int[] numbers1 = new int[4];
      int[] numbers2 = new int[4];
      boolean ok = true;
      
      for(int i = 0; i < 4; i++)
         numbers1[i] = scan.nextInt();
      
      for(int i = 0; i < 4; i++)
         numbers2[i] = scan.nextInt();
      
      for(int i = 0; i < 4 && ok; i++)
      {
         if(numbers1[i] != numbers2[i] )
            ok = false;
      }
      
      if(ok == true)
      {
         System.out.println("They are identical arrays");
      }
      else
         System.out.println("They are not identical arrays");
      scan.close();
   }
}
