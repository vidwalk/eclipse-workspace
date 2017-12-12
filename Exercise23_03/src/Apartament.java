
public class Apartament extends Home
{
   double rent;

   Apartament(String address, double rent)
   {
      super(address);
      this.rent = rent;
   }

   public String getInfo()
   {
      return "This is the rent: " + this.rent + " and the address"
            + super.getAdress();
   }

}
