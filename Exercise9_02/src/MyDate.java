import java.util.Scanner;

public class MyDate
{
   int month, day, year;
   Scanner scan = new Scanner(System.in);

   public MyDate(int m, int d, int y)
   {
      month = m;
      day = d;
      year = y;
   }

   public int getMonth()
   {
      return month;
   }

   public int getDay()
   {
      return day;
   }

   public int getYear()
   {
      return year;
   }

   public void set(int m, int d, int y)
   {
      month = m;
      day = d;
      year = y;
   }

   public void tostring()
   {
      if (year > 1900)
      {
         if (day < 10 && month < 10)
         {
            System.out.println("0" + day + "/0" + month + "/" + year);
         }
         else if (day < 10)
         {
            System.out.println("0" + day + month + "/" + year);
         }
         else if (month < 10)
         {
            System.out.println(day + "/0" + month + "/" + year);
         }
      }
      else
      {  while( year < 1000) {
         System.out.println("Please input the year again in 4-digit format: ");
         year = scan.nextInt();
      }
         if (day < 10 && month < 10)
         {
            System.out.println("0" + day + "/0" + month + "/" + year);
         }
         else if (day < 10)
         {
            System.out.println("0" + day + month + "/" + year);
         }
         else if (month < 10)
         {
            System.out.println(day + "/0" + month + "/" + year);
         }
      }
   }

   public boolean answerTo(String e)
   {
      if (e.equals("y"))
         return false;
      return true;
   }
}
