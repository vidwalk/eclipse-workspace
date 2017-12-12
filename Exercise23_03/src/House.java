
public class House extends Home
{
   double price;

   House(String address, double price)
   {
      super(address);
      this.price = price;
   }

   public String getInfo()
   {
      return "This is the price: " + this.price + " and the address"
            + super.getAdress();
   }

}
