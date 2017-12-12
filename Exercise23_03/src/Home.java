
public abstract class Home
{
   String address;

   Home(String address)
   {
      this.address = address;
   }

   public String getAdress()
   {
      return this.address;
   }

   public abstract String getInfo();
}
