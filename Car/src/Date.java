import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date
{
   int day;
   int month;
   int year;

   public Date(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public Date()
   {
      Calendar now = GregorianCalendar.getInstance();
      this.day = now.get(Calendar.DAY_OF_MONTH);
      this.month = now.get(Calendar.MONTH) + 1;
      this.year = now.get(Calendar.YEAR);
   }

   public void set(int day, int month, int year)
   {
      this.month = month;
      this.day = day;
      this.year = year;
      if (this.month < 1)
         this.month = 1;
      if (month >= 12)
         this.month = 12;
      if (this.year < 0)
         this.year = 0 - this.year;
      if (this.day < 1)
         this.day = 1;
      switch (this.month)
      {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
         {
            if (this.day > 31)
               this.day = 31;
            break;
         }
         case 4:
         case 6:
         case 9:
         case 11:
         {
            if (this.day > 30)
               this.day = 30;
            break;
         }
         case 2:
         {
            if (this.day > 28)
               this.day = 28;
            break;
         }
         default:
         {
            this.month = 0;
            break;
         }
      }
   }

   public int numberOfDaysInMonth()
   {
      switch (this.month)
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

   public boolean isLeapYear()
   {
      if (this.year % 4 == 0 && (this.year % 100 != 0 || this.year % 400 == 0))
         return true;
      return false;
   }

   public Date copy()
   {

      Date copydate = new Date(day, month, year);
      return copydate;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Date))
      {
         return false;
      }
      Date object = (Date) obj;
      if (this.day == object.day && this.month == object.month
            && this.year == object.year)
         return true;
      return false;
   }

   public String toString()
   {
      
      String result = "";
      if (day < 10 && month < 10)
      {
         result = result + "0" + day + "/0" + month + "/" + year;
      }
      else if (day < 10)
      {
         result = result + "0" + day + month + "/" + year;
      }
      else if (month < 10)
      {
         result = result + day + "/0" + month + "/" + year;
      }
      else if (month >= 10 && day >= 10)
      {
         result = result + day + "/" + month + "/" + year;
      }
      return result;
   }
}
