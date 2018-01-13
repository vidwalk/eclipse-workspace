import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate
{
   int day;
   int month;
   int year;

   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public void set(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   public MyDate copy()
   {
      MyDate copy = new MyDate(this.day, this.month, this.year);
      return copy;
   }
// important to remember
   public static MyDate now() {
      MyDate today;
      Calendar now = GregorianCalendar.getInstance();
      System.out.println(now.get(Calendar.YEAR));
      today= new MyDate( now.get(Calendar.DAY_OF_MONTH),now.get(Calendar.MONTH)+1, now.get(Calendar.YEAR));
      return today;
   }
}

