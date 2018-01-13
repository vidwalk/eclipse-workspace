
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

   public Date copy()
   {
      Date copy = new Date(this.day, this.month, this.year);
      return copy;
   }

   public String toString()
   {
      return "" + day + "/" + month + "/" + year;
   }

   public boolean equals(Object obj)
   {

         if (!(obj instanceof Date))
         {
            return false;
         }
         Date copy = (Date) obj;
         if (copy.getDay() == day && copy.getMonth() == month
               && copy.getYear() == year)
            return true;
         return false;
   }
}
