import java.util.Scanner;

public class CountNegatives
{
   public static void main(String[] args)
   {  Scanner scan = new Scanner(System.in);
      System.out.println("Introduce the size of the array");
      int size = scan.nextInt();
      int number[] = new int[size];
      int count = 0;
      
      for(int i = 0; i < size ; i++)
      {
         number[i] = scan.nextInt();
         
         if(number[i] < 0)
            count++;
      }
      
      System.out.println("The number of negative numbers is " + count);
      scan.close();
   }
}
