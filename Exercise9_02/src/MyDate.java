import java.util.Scanner;

public class MyDate
{
   int month, day, year;
   Scanner scan = new Scanner(System.in);

   public MyDate(int m, int d, int y)
   {
      set(m, d, y);
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
      if (month < 1)
         month = 1;
      if (month >= 12)
         month = 12;
      if (year < 0)
         year = 0 - year;
      if (day < 1)
         day = 1;
      switch (month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
         {
            if (day > 31)
               day = 31;
            break;
         }
         case 4:
         case 6:
         case 9:
         case 11:
         {
            if (day > 30)
               day = 30;
            break;
         }
         case 2:
         {
            if (day > 28)
               day = 28;
            break;
         }
         default:
         {
            month = 0;
            break;
         }
      }
   }

   public String toString()
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
         else if (month > 10 && day > 10)
         {
            System.out.println(day + "/" + month + "/" + year);
         }

      }
      else
      {
         while (year < 1000)
         {
            System.out
                  .println("Please input the year again in 4-digit format: ");
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
         else if (month > 10 && day > 10)
         {
            System.out.println(day + "/" + month + "/" + year);
         }
      }
      return null;
   }

   public boolean answerTo(String e)
   {
      if (e.equals("y"))
         return false;
      return true;
   }

   public static int convertToMonthNumber(String monthName)
   {
      switch (monthName)
      {
         case "january":
            return 1;
         case "february":
            return 2;
         case "march":
            return 3;
         case "april":
            return 4;
         case "may":
            return 5;
         case "june":
            return 6;
         case "july":
            return 7;
         case "august":
            return 8;
         case "september":
            return 9;
         case "october":
            return 10;
         case "november":
            return 11;
         case "december":
            return 12;
         default:
            return 0;
      }

   }

   public void set(int day, String monthName, int year)
   {
      this.day = day;
      this.year = year;
      this.month = MyDate.convertToMonthNumber(monthName);
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof MyDate))
      {
         return false;
      }
      MyDate object = (MyDate) obj;
      if (this.day == object.getDay() && this.month == object.getMonth()
            && this.year == object.getYear())
         return true;
      return false;
   }

   public MyDate copy()
   {

      MyDate copydate = new MyDate(month, day, year);
      copydate.month = month;
      copydate.day = day;
      copydate.year = year;
      return copydate;
   }

   public boolean isLeapYear()
   {
      if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
         return true;
      return false;
   }

   public int numberOfDaysInMonth()
   {
      switch (month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
            return 31;
         case 2:
            if (isLeapYear())
               return 29;
            else
               return 28;
         case 4:
         case 6:
         case 9:
         case 11:
            return 30;
         default:
            return 0;
      }
   }

   public String getMonthName()
   {
      switch (month)
      {
         case 1:
            return "january";
         case 2:
            return "february";
         case 3:
            return "march";
         case 4:
            return "april";
         case 5:
            return "may";
         case 6:
            return "june";
         case 7:
            return "july";
         case 8:
            return "august";
         case 9:
            return "september";
         case 10:
            return "october";
         case 11:
            return "november";
         case 12:
            return "december";
         default:
            return "no month";
      }
   }

   public void stepForwardOneDay()
   {
      this.day = this.day + 1;
      boolean ok = false;
      switch (month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
         {
            if (day > 31)
            {
               day = 1;
               ok = true;
            }
            break;
         }
         case 4:
         case 6:
         case 9:
         case 11:
         {
            if (day > 30)
            {
               day = 1;
               ok = true;
            }
            break;
         }
         case 2:
         {
            if (day > 29 && isLeapYear())
            {
               day = 1;
               ok = true;
            }
            else if (day > 28 && isLeapYear() == false)
            {
               day = 1;
               ok = true;
            }
            break;
         }
         default:
         {
            day = 0;
            break;
         }
      }
      if (ok == true)
         this.month++;
      if (this.month > 12)
      {
         this.month = 1;
         this.year++;
      }
   }

   public void stepForward(int numberDays)
   {
      for (int i = 0; i < numberDays; i++)
         stepForwardOneDay();
   }
   
   public MyDate()
   {
      
   }
}
