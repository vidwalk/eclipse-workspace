
public class FamilyCar extends Car
{
   int seats;

   public FamilyCar(String licenseNo, double price, int seats)
   {
      super(licenseNo, price);
      this.seats = seats;
   }

   public String getType()
   {
      return "FamilyCar";
   }

   public int getSeats()
   {
      return seats;
   }
}
