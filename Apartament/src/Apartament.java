
public class Apartament
{
   String address;
   double rent;
   Tenant tenant;

   public Apartament(String adress, double rent)
   {
      this.address = adress;
      this.rent = rent;
   }

   public String getAdress()
   {
      return this.address;
   }

   public void setRent(double rent)
   {
      this.rent = rent;
   }

   public double getRent()
   {
      return this.rent;
   }

   public void rentTo(String name, String phone)
   {
      this.tenant = new Tenant(name, phone);
   }

   public void evict()
   {
      this.tenant = null;
   }

   public boolean isOccupied()
   {
      if (this.tenant == null)
         return false;
      return true;
   }

   public Tenant getTenant()
   {
      if (isOccupied())
      {
         Tenant copyTenant = this.tenant.copy();
         return copyTenant;
      }
      return null;
   }

   public double getRentDue()
   {
      if (isOccupied())
      {
         return this.tenant.rentDue;
      }
      return -1;
   }

   public void chargeRent()
   {
      if (isOccupied())
      {
         this.tenant.rentDue = this.tenant.rentDue + rent;
      }
   }

   public void collectRent(double amount)
   {
      if (isOccupied())
      {
         this.tenant.rentDue = this.tenant.rentDue - amount;
      }
   }

   public String toString()
   {
      String result = "";

      if (isOccupied())
      {
         result = result + this.address + " " + this.rent + " "
               + this.tenant.toString();
      }
      else
      {
         result = result + "No tenant";
      }

      return result;
   }
}
