
public class Tenant
{
   String name;
   String phone;
   double rentDue;

   public Tenant(String name, String phone)
   {
      this.name = name;
      this.phone = phone;
      rentDue = 0;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

   public void setRentDue(double rentDue)
   {
      this.rentDue = rentDue;
   }

   public String getName()
   {
      return this.name;
   }

   public String getPhone()
   {
      return this.phone;
   }

   public double getRentDue()
   {
      return this.rentDue;
   }

   public Tenant copy()
   {
      Tenant copyTenant = new Tenant(this.name, this.phone);
      return copyTenant;
   }

   public String toString()
   {
      String result = "";
      result = result + this.name + " " + this.phone + " " + this.rentDue;
      return result;
   }
}
