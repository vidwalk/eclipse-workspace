
public class Service
{
   int mileage;
   Date date;

   public Service(int mileage, Date date)
   {
      this.mileage = mileage;
      this.date = date.copy();
   }

   public int getMileage()
   {
      return this.mileage;
   }

   public Date getDate()
   {
      return this.date;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Service))
      {
         return false;
      }
      Service object = (Service) obj;
      if (this.mileage == object.mileage && this.date.equals(object.getDate()))
         return true;
      return false;
   }

   public String toString()
   {
      String result = "";
      result = result + " " + this.date.toString();
      return result;
   }
}
