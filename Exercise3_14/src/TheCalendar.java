import java.util.Scanner;

public class TheCalendar
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int d = scan.nextInt();
      int m = scan.nextInt();
      int y = scan.nextInt();
      switch (m)
      {
         case 1:
            
            if (d > 0 && d <= 31)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;
            
         case 2:

            if (d > 0 && d <= 28)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 3:
            
            if(d > 0 && d <= 31)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 4:
            
            if(d > 0 && d <= 30)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 5:
            
            if(d > 0 && d <= 31)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 6:
            
            if(d > 0 && d <= 30)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 7:
            
            if(d > 0 && d <= 31)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 8:
            
            if(d > 0 && d <= 31)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 9:
            
            if(d > 0 && d <= 30)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 10:
            
            if(d > 0 && d <= 31)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 11:
            
            if(d > 0 && d <= 30)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         case 12:
            
            if(d > 0 && d <= 31)
               System.out.println(d + "/" + m + "/" + y);
            else
               System.out.println("Illegal date");
            break;

         default:
            System.out.println("Illegal date");
            break;   
      }
      scan.close();
   }
}
